package com.ruicai.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test7 {
      /**
       * 字节输入输出流
       * @param args
       * @throws IOException
       */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        // File file =new File("shi.txt");
        // file.createNewFile();
         FileOutputStream file=new FileOutputStream("shi.txt");
         file.write("生当作人杰".getBytes());
         file.write("\r\n死亦为鬼雄".getBytes());
         file.write("\r\n至今思项羽".getBytes());
         file.write("\r\n不肯过江东".getBytes());
		 FileInputStream file1=new FileInputStream(new File("shi.txt"));
		 FileOutputStream file2=new FileOutputStream(new File("shi1.txt"));
          byte [] b=new byte[1024];
         int len=0;
         while((len=file1.read(b))>0){
        	 System.out.print(new String(b,0,len));
        	 file2.write(b,0,len);
         }
         File f=new File("zi.txt");
         f.createNewFile();
         FileInputStream file4=new FileInputStream(new File("zi.txt"));
		 FileOutputStream file5=new FileOutputStream(f);
		 FileOutputStream file3=new FileOutputStream(new File("zi1.txt"));
		 byte [] y={97,98,99};
		 file5.write(y);
		 int n=0;
		 while((n=file4.read())!=-1){
			 //System.out.print("\n"+(char)n);
			 file3.write(n);
		 }
         file.close();
         file1.close();
         file2.close();
         file3.close();
         file4.close();
         file5.close();
         
	}

}
