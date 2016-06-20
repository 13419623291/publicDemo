package com.ruicai.File;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      File file=new File("f:\\test.txt");
//      file.createNewFile();
//      System.out.println("chuangjian ");
//      System.out.println("删除："+file.delete());
//      System.out.println("创建："+file.mkdir());创建一个文件夹file.mkdirs()创建多重文件夹
//      File file2=new File(file,"test");
//      System.out.println(file2.createNewFile());
//      System.out.println("删除："+file2.delete());
//     File file3=new File("f:\\xinjian");
//      System.out.println(file.renameTo(file3));
//      String [] arr=file.list();
//      for (String string : arr) {
//		System.out.print(string+" ");
		
//	}
     // System.out.println("删除："+file3.delete());
      System.out.println("创建文件夹："+file.mkdir());
      File file1=new File(file,"test.doc");
      System.out.println("创建文件："+file1.createNewFile());
      file.delete();
      file1.delete();
	}

}
