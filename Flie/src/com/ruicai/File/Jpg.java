package com.ruicai.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 3.实现图片的拷贝：将c:\\1.jpg文件复制到d:\\1.jpg
 * @author Administrator
 *
 */
public class Jpg {

	public static void main(String[] args) throws IOException {
		// 创建输入输出流对象并指定文件
       FileInputStream  fis=new FileInputStream("test.txt");
       FileOutputStream fos=new FileOutputStream("test1.txt");
       //调用read方法读取文件
       byte[]b=new byte[256];
       int len;
       while((len=fis.read(b))>0){
    	   //调用write方法写入文件
    	   fos.write(b, 0, len);
       }
       //关闭输入输出流
       fis.close();
       fos.close();
	}
   
}
