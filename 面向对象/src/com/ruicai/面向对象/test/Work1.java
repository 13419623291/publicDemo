package com.ruicai.面向对象.test;

import java.util.Scanner;

import com.ruicai.面向对象.entity.Work1Class;

public class Work1 {
     /**猜数字游戏：一个类A有一个成员变量v，有一个初值100。
      * 定义一个类，对A类的成员变量v进行猜。
      * 如果大了则提示大了，小了则提示小了。等于则提示猜测成功。
      */
	public static void main(String[] args) {
		//接收键盘输入数据
		Scanner sca=new Scanner(System.in);
		//输入数字
		System.out.println("请输入您猜测的数字");
		int num=sca.nextInt();
		//通过构造方法创建对象同时调用方法并为方法赋值
		new Work1Class().bi(num);

	}

}
