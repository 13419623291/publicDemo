package com.ruicai.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

/**
     * 打印流：本质也是一种输出流
     * 
     * @author Administrator
     *
     */
public class Test9 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       String name="小刚";
       int age=18;
       String id="武汉";
       double java=89;
       PrintStream ps=new PrintStream("zi1.txt");
       ps.printf("姓名：%s \n年龄：%d \n地址：%s \njava成绩：%f", name,age,id,java);
//       ps.print("\n"+name);
//       ps.print(age);
//       ps.print(id);
//       ps.print(java+"\n");
       FileInputStream file=new FileInputStream("shi.txt");
       byte[]y=new byte[1024];
       int len=0;
      while((len= file.read(y))>0){
    	  ps.write(y, 0, len);
      }
       ps.write(33);
       
       
       byte[]b={97,98,99,100};
       ps.write(b);
       
       
	}

}
