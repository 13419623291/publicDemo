package com.ruicai.File;

import java.io.File;
import java.io.IOException;

/* 什么是IO：Input，Output的首字母
流就是数据
IO流就是数据的流入流出
IO的作用：保存用户的数据或者从硬盘读取数据
mysql：（作用：保存用户的数据或者从硬盘读取数据）数据库管理系统可以更方便的管理数据
——————--------------——————-------------——————------------————
java  IO流：
1：从流的方向来看分为输入流、输出流【针对数据的方向而言】
2：从流的数据处理单位来看分为字节流、字符流
实际上可以把这两类放在一起看分为：输入字节流、输出字节流、输入字符流、输出字符流
任何一个数据在实际应用中会包含输入与输出
——————--------------——————-------------——————------------————
在java IO包中两种流的继承体系;
1.以字节为处理数据的：xxxxStream
2.以字符为处理数据的：xxxxReader
——————--------------——————-------------——————------------————
java中规定%　＠　！等等称为字符
字节与字符是两种不同的单位ｊａｖａ在处理输入输出时针对这两种单位分别做了不同处理
针对字节：InputStream   OutputStream表示处理字节的输入输出
针对字符：Reader（写入）  writer（写出）表示处理字节的输入输出
输入输出是针对内存而言的
java采用的是Unicode编码集：汉字和英文都为2个字节
ASCII码中英文1个字节，中文2个字节
UTF-8与Unicode在编码存储时有些不同中文3个字节 英文1个字节
--------------------------------------------------------------------------------------------------
计算机实现数据的持久化的操作有哪些？
1.IO：把数据保存在文本中
2.数据库【mysql  oracle.........  保存数据】
计算机数据的来源？
1.Scanner：键盘输入
2.计算机本地数据----->磁盘文件
3.网络请求数据----->用户登录系统等等
Linux :redHat Linux---->1:收费 2：免费
       Ubuntu  Linux
       CentorOs  Linux
       
 */
public class Test4 {
        
	public static void main(String[] args) throws IOException  {
		//File.separator此方法获取当前系统下的分隔符
        File file=new File("F:"+File.separator+"fileTest.txt");
        //通过exists()方法判断该文件是否存在
        if(!file.exists()){
			System.out.println("创建文件："+file.createNewFile());
        	System.out.println("返回绝对路径："+file.getAbsolutePath());
        	System.out.println("判断是否是标准文件："+file.isFile());
        	System.out.println("判断是否是绝对路径："+file.isAbsolute());
        	System.out.println("是否可执行："+file.canExecute());
        	System.out.println("是否可读："+file.canRead());
        }else{
        	//file.delete();//删除
        }
       
        
	}

}
