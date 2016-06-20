package com.ruicai.面向对象.test;

import java.util.Scanner;

import com.ruicai.面向对象.entity.Work3Time;

public class Work3 {
	/**
	 * 在程序中，经常要对时间进行操作，但是并没有时间类型的数据。那么，我们可以自己实现一个时间类，来满足程序中的需要。
	定义名为MyTime的类，其中应有三个整型成员：时（hour），分（minute），秒（second），
	为了保证数据的安全性，这三个成员变量应声明为私有。
	为MyTime类定义构造方法，以方便创建对象时初始化成员变量。
	再定义diaplay方法，用于将时间信息打印出来。
	为MyTime类添加以下方法：
	addSecond(int sec)
	addMinute(int min)
	addHour(int hou)
	subSecond(int sec)
	subMinute(int min)
	subHour(int hou)
	分别对时、分、秒进行加减运算
	 */
	public static void main(String[] args) {
		//通过构造方法创建对象同时为其赋值
		Work3Time time=new Work3Time(0,0,0);
		//接收外部数据输入
		Scanner sca=new Scanner(System.in);
		while(true){
		//选择加时还是减时
		System.out.println("请输入您的选择\n1.加时间  2.减时间");
		int num=sca.nextInt();
		switch(num){
		case   1:
			System.out.println("请分别输入您所加的时、分、秒(中间用空格隔开)");
			//调用方法并为其赋值
			time.addHour(sca.nextInt());
			time.addMinute(sca.nextInt());
			time.addSecond(sca.nextInt());
		break;
		case   2:
			System.out.println("请分别输入您所减的时、分、秒(中间用空格隔开)");
			//调用方法并为其赋值
			time.subHour(sca.nextInt());
			time.subMinute(sca.nextInt());
			time.subSecond(sca.nextInt());
		break;
		default:
			System.out.println("您的选择有误，请重新选择");
		}
		//利用对象调用方法输出结果
		time.diaplay();
	  }	
	}

}
