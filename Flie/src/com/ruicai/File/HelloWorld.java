package com.ruicai.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 2.（FileInputStream 和FileOutputStream）利用FileInputStream 和FileOutputStream，完
成
下面的要求：
1） 用FileOutputStream 在当前目录下创建一个文件“test.txt”，并向文件输出“Hello
World”，如果文件已存在，则在原有文件内容后面追加。
2） 用FileInputStream 读入test.txt 文件，并在控制台上打印出test.txt 中的内容。
3） 要求用try-catch-finally 处理异常，并且关闭流应放在finally 块中。
 * @author Administrator
 *
 */
public class HelloWorld {

	public static void main(String[] args) {
		// 分别创建输入 输出流对象
		FileOutputStream fos = null;
		FileInputStream fis = null;
       try {
    	//指定输出的文件，当构造方法中boolean的值为true时接着原文件末尾写入
		fos=new FileOutputStream("test.txt", true);
		//写入HelloWorld
	    fos.write("HelloWorld".getBytes());
	    //指定输入流文件
	    fis=new FileInputStream("test.txt");
	    //调用read（byte[]b）方法循环文件将其转换为字节通过调String的构造方法输出
	    byte[]b=new byte[1024];
	    int len;
	    while((len=fis.read(b))>0){
	    	System.out.println(new String(b,0,len));
	    }
	   } catch (FileNotFoundException e) {
		 e.printStackTrace();
	   }catch (IOException e) {
		 e.printStackTrace();	
	   }finally{
		 try {
			//分别关闭输入输出流
			fos.close();
			fis.close();
		 } catch (IOException e){
			e.printStackTrace();
		 }
	    }
    }
}
