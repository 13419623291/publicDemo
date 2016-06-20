package com.ruicai.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test8 {
      /**
       * 字节字符转换流
       * @param args
       * @throws IOException
       */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       InputStreamReader in=new InputStreamReader(new FileInputStream("test.txt"));
       int len=0;
       while((len=in.read())!=-1){
    	   System.out.print((char)len);
       }
//       OutputStreamWriter out=new OutputStreamWriter(new FileOutputStream("test.txt"));
//       out.write("锄禾日当午");
//       out.close();
	}



}
