package com.ruicai.File;

import java.io.File;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3.testFile(new File("D:\\E盘资料PLC暂存\\PLC"));
/*      public String[] list()返回一个字符串数组，
 * 这些字符串指定此抽象路径名表示的目录中的文件和目录。
 * 例： 三菱PLC编程软件及仿真软件 三菱触摸屏软件 gtw3_cl_101b_disc1 GTD3 setup.inx
 *
 * public File[] listFiles()返回一个抽象路径名数组，
 * 这些路径名表示此抽象路径名表示的目录中的文件。
 * 例：D:\E盘资料PLC暂存\PLC\新建文件夹 (2)\三菱PLC编程软件及仿真软件\三菱触摸屏软件\gtw3_cl_101b_disc1\GTD3\setup.inx
 */
	}
	/*
	 * 定义testFile方法用来遍历文件名
	 */
	
	
       public static void testFile(File file){
    	   //调用public File[] listFiles()方法
       File [] arrfile=file.listFiles();
       //判断目录数组是否为且数组长度是否大于0满足执行以下程序
       if(arrfile!=null&&arrfile.length>0){
    	   for (File file2 : arrfile) {
    		 //判断遍历出的是否是一个目录若是则执行方法继续遍历不是则打印
    		   //递归
			if(file2.isDirectory()){
				testFile(file2);
			}else{
				System.out.println(file2);
			}
		}
       }
	
    }
}
