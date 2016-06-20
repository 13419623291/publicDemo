package com.ruicai.File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test10 {
	/**
	 * 高效转换的buffered
	 * @param args
	 * @throws IOException 
	 */
   public static void main(String[] args) throws IOException {
	BufferedOutputStream out=new BufferedOutputStream(new FileOutputStream("test.txt"));
	out.write("在那遥远的地方".getBytes());
	out.close();
	BufferedInputStream in=new BufferedInputStream(new FileInputStream("test.txt"));
	byte[]b=new byte[1024];
	int len=0;
	while((len=in.read(b))!=-1){
		System.out.print(new String(b,0,len));
	}
	in.close();
}
}
