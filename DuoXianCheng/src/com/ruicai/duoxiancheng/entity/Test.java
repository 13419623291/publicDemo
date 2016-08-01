 package com.ruicai.duoxiancheng.entity;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Test{
	public static void main(String args[]) throws IOException{
		File file=new File("D:\\test.dat");
		//判断文件是否存在 若存在就读出数据+1后写进去 不存在创建一个写入数据
		if(!file.exists()){
			 DataOutputStream dos=new DataOutputStream(new FileOutputStream(file));
		     dos.writeLong(10000l);
		     dos.close();
		}else{
			 DataInputStream dis=new DataInputStream(new FileInputStream(file) );
			 Long num=dis.readLong();
			 System.out.println(num);
			 num+=1;
			 DataOutputStream dos1=new DataOutputStream(new FileOutputStream(file));
			 dos1.writeLong(num);
			 dis.close();
			 dos1.close();
	  }
		
	}
}

