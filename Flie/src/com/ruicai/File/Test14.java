package com.ruicai.File;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test14 {
    //数据流
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       FileOutputStream fos=new FileOutputStream("Test14.txt");
       DataOutputStream dos=new DataOutputStream(fos);
       dos.writeLong(3455324578935645262l);
       dos.writeInt(1234567654);
       byte[]b={12,34,67,121,44,1};
       dos.write(b);
       dos.writeBoolean(true);
       System.out.println("写入的字节数："+dos.size());
       FileInputStream fis=new FileInputStream("Test14.txt");
       DataInputStream dis=new DataInputStream(fis);
       System.out.println(dis.readInt());
       System.out.println(dis.readLong());
       System.out.println(dis.read(b,0,6));
       System.out.println(dis.readBoolean());
       dis.close();
       fis.close();
       dos.close();
       fos.close();
       
	}

}
