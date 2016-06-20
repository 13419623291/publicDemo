package com.ruicai.File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Test11 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      RandomAccessFile af=new RandomAccessFile("test.txt", "rws");
      System.out.println("他的长度："+af.length());
      af.seek(af.length());
      af.write("有位好姑娘".getBytes());
      af.write("天上人间".getBytes());
      af.seek(0);
      byte []b=new byte[1024];
      int len=0;
      while((len=af.read(b))!=-1){
    	  System.out.println(new String(b,0,len));
      }
      
      
 
	}

}
