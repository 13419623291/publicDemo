package com.ruicai.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import com.ruicai.File.entity.Student;

public class Test6 {
	/*
	 * 对象流
	 * RandomAccessFile:拼接
	 */
       public static void main(String[] args) throws IOException, ClassNotFoundException  {
    	Student stu=new Student("小刚","119");
    	Student stu1=new Student("小明","120");
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("test1.txt"));
		out.writeObject(stu);
		out.writeObject(stu1);
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("test1.txt"));
		Student obj=(Student)in.readObject();
		System.out.println(obj);
		
		ObjectOutputStream out2=new ObjectOutputStream(new FileOutputStream("test3.txt"));
		String str=stu.toString();
		out2.write(str.getBytes());
		
//		FileOutputStream out1=new FileOutputStream("test2.txt");		
//		String str=stu.toString();
//		out1.write(str.getBytes());
		out.close();
//		out1.close();
		in.close();
		out2.close();
		
		
	}
}
