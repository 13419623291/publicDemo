package com.ruicai.File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**缓冲流
 * 字节缓冲流：BufferedInputStream,BufferedOutputStream
 * @author Administrator
 *
 */
public class Test13 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       FileInputStream fis=new FileInputStream("shi.txt");
       FileOutputStream fos=new FileOutputStream("Test.131");
       //BufferedInputStream(InputStream in(流), int size（缓冲字节长度）)
//       BufferedInputStream bis=new BufferedInputStream(fis,2048);
//       BufferedOutputStream bos=new BufferedOutputStream(fos,2048);
//       int len=0;
//       while((len=bis.read())!=-1){
//    	   bos.write(len);
//    	   bos.flush();
//       }
//       bos.close();
//       bis.close();
       BufferedInputStream bis=new BufferedInputStream(fis,256);
       BufferedOutputStream bos=new BufferedOutputStream(fos);
       byte[]b=new byte[1024];
       int len=0;
       while((len=bis.read(b))!=-1){
    	   bos.write(b,0,len);
    	   bos.flush();
       }
       bos.close();
       bis.close();
       
	}

}
