package com.ruicai.scxz;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.jasper.tagplugins.jstl.core.ForEach;



@WebServlet (urlPatterns={"/upload"})
public class uploadServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action=request.getParameter("action");
		if(action.equals("shang")){
			shang(request,response);
		}else if(action.equals("list")){//获取下载列表
			list(request,response);
		}else if(action.equals("down")){//下载
			down(request,response);
		}
	}
   
/**	
 * 下载
 * @param request
 * @param response
 */
	
private void down(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	// 获取用户下载的文件名称(url地址后追加数据,get)
	try {
//	request.setCharacterEncoding("UTF-8");
	String fileName = request.getParameter("fileName");
	fileName = new String(fileName.getBytes("ISO8859-1"),"UTF-8");
	System.out.println(fileName);
	// 先获取上传目录路径
	String path = PropertiesUtil.getValue("imagePath");
	//获取一个字节流
	InputStream in=new FileInputStream(new File(path,fileName)); 
	// 如果文件名是中文，需要进行url编码
	fileName = URLEncoder.encode(fileName, "UTF-8");
	// 设置下载的响应头
	response.setHeader("content-disposition", "attachment;fileName=" + fileName);
	//输出流
	OutputStream on=response.getOutputStream();
	byte []b=new byte[1024];
	int len =0;
	while ((len = in.read(b)) != -1){
		on.write(b, 0, len);
	}
	// 关闭
	on.close();
	in.close();
	
	} catch (Exception e) {
		e.printStackTrace();
	}
	}



/**
 * 获取下载列表
 * @param request
 * @param response
 */

  private void list(HttpServletRequest request, HttpServletResponse response) {
	// 实现思路：先获取upload目录下所有文件的文件名，再保存；跳转到down.jsp列表展示
	//1. 初始化map集合Map<包含唯一标记的文件名, 简短文件名>  ;
	  Map<String,String> fileNames=new HashMap<String,String>();
	 //2.获取上传目录
	  String path = PropertiesUtil.getValue("imagePath");
	// 目录
	File file = new File(path);
	// 目录下，所有文件名
	String list[] = file.list();
	// 遍历，封装
	if (list != null && list.length > 0){
		for (int i=0; i<list.length; i++){
			// 全名
			String fileName = list[i];
			// 短名
			String shortName = fileName.substring(fileName.lastIndexOf("#")+1);
			// 封装
			fileNames.put(fileName, shortName);
		}
	}
	// 3. 保存到request域
	request.setAttribute("fileNames", fileNames);
	// 4. 转发
	try {
		request.getRequestDispatcher("downlist.jsp").forward(request, response);
	} catch (ServletException e) {
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  
	  
	}



/**
 * 上传
 * @param request
 * @param response
 */

private void shang(HttpServletRequest request, HttpServletResponse response){
		try {
		//创建磁盘工厂
		FileItemFactory factory=new DiskFileItemFactory(); 
		//创建上传核心工具类
		ServletFileUpload upload=new ServletFileUpload(factory);
		//设置单个文件的大小
		upload.setFileSizeMax(10*1024*1024);
		//设置单个上传表单的大小
		upload.setSizeMax(100*1024*1024);
		//设置编码格式
		upload.setHeaderEncoding("UTF-8");
		
		//判断当前表单是否是文件上传表单
		if(upload.isMultipartContent(request)){
			//把上传对象转换为FileItem对象使用集合封装	
			List<FileItem> list=upload.parseRequest(request);
			//遍历集合得到每个元素
		    for (FileItem item : list) {
		    	//普通表单元素
				if(item.isFormField()){
					// 普通文本数据
					String fieldName = item.getFieldName();	// 表单元素名称
					String content = item.getString();		// 表单元素名称， 对应的数据
					//item.getString("UTF-8");  指定编码
				}
				// 上传文件(文件流) ----> 上传到upload目录下
				else{//带文件的表单元素
					String fieldName = item.getFieldName();	// 表单元素名称
					String name = item.getName();			// 文件名				
					String content = item.getString();		// 表单元素名称， 对应的数据
					String type = item.getContentType();	// 文件类型
					//InputStream in = item.getInputStream(); // 上传文件流
					long size=item.getSize();
					/*
					 *  四、文件名重名
					 *  对于不同用户readme.txt文件，不希望覆盖！
					 *  后台处理： 给用户添加一个唯一标记!
					 */
					// a. 随机生成一个唯一标记
					String id = UUID.randomUUID().toString();
					// b. 与文件名拼接
					name = id +"#"+ name;
					// 获取上传基路径
					String path = PropertiesUtil.getValue("imagePath")+name;
					// 创建目标文件
					File file = new File(path);
					InputStream is=item.getInputStream();
					byte[]b=new byte[1024];
					int len=0;
					double bili=0.0;
					FileOutputStream os=new FileOutputStream(file);
					while((len=is.read(b))!=-1){
						bili+=len/size*100D;//获取上传百分比
						os.write(b, 0, len);
						request.getSession().setAttribute("bi", Math.round(bili));
					}
					os.close();
					// 工具类，文件上传
					//item.write(file);
					item.delete();//关闭临时文件
					response.sendRedirect("index.jsp");
				}
			}
		}else{	
		
				List<FileItem> list=upload.parseRequest(request);
				for (FileItem item : list) {
					
				
				String fieldName = item.getFieldName();	// 表单元素名称
				String name = item.getName();			// 文件名				
				String content = item.getString();		// 表单元素名称， 对应的数据
				String type = item.getContentType();	// 文件类型
				InputStream in = item.getInputStream(); // 上传文件流
				
				/*
				 *  四、文件名重名
				 *  对于不同用户readme.txt文件，不希望覆盖！
				 *  后台处理： 给用户添加一个唯一标记!
				 */
				// a. 随机生成一个唯一标记
				String id = UUID.randomUUID().toString();
				// b. 与文件名拼接
				name = id +"#"+ name;
				// 获取上传基路径
				String path = PropertiesUtil.getValue("imagePath")+name;
				// 创建目标文件
				File file = new File(path);
				
				// 工具类，文件上传
				item.write(file);
				item.delete();//关闭临时文件
				response.sendRedirect("index.jsp");
			}
		
		  }
		  } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
   }
}