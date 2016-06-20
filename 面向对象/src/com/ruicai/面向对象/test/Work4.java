package com.ruicai.面向对象.test;

import java.util.Scanner;

import com.ruicai.面向对象.entity.Work4ji;

public class Work4 {
    /**
     * 编写Java程序，模拟简单的计算器。
     * 定义名为Number的类，其中有两个整型数据成员n1和n2，应声明为私有。
     * 编写构造方法，赋予n1和n2初始值，
     * 再为该类定义加（addition）、减（subtration）、乘（multiplication）、除（division）等公有成员方法，
     * 分别对两个成员变量执行加、减、乘、除的运算。在main方法中创建Number类的对象，调用各个方法，并显示计算结果。
     */
	public static void main(String[] args) {
		// 接收外部数据输入
       Scanner sca=new Scanner(System.in);
       //分别输入两个数据
       System.out.println("请输入第一个整数");
       int num1=sca.nextInt();
       System.out.println("请输入第二个整数");
       int num2=sca.nextInt();
     //通过构造方法创建对象同时为其赋值
       Work4ji num=new Work4ji(num1,num2);
       //利用对象调用方法并打印出结果
       System.out.println("它们的和为："+num.addition());
       System.out.println("它们的差为："+num.subtration());
       System.out.println("它们的积为："+num.multiplication());
       System.out.println("它们相除为："+num.division());
	}

}
