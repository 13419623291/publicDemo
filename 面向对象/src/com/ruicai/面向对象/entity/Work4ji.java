package com.ruicai.面向对象.entity;
/**
 * 编写Java程序，模拟简单的计算器。
 * 定义名为Number的类，其中有两个整型数据成员n1和n2，应声明为私有。
 * 编写构造方法，赋予n1和n2初始值，
 * 再为该类定义加（addition）、减（subtration）、乘（multiplication）、除（division）等公有成员方法，
 * 分别对两个成员变量执行加、减、乘、除的运算。在main方法中创建Number类的对象，调用各个方法，并显示计算结果。
 */
public class Work4ji {
	//定义私有成员变量
   private int n1;
   private int n2;
 //定义带参的构造方法
   public Work4ji(int n1, int n2) {
	   this.n1 = n1;
	   this.n2 = n2;
 }
   //定义相加的运算方法
   public int addition(){
	   return n1+n2;
   }
 //定义相减的运算方法
   public int subtration(){
	   return n1-n2;
   }
 //定义相乘的运算方法
   public int multiplication(){
	   return n1*n2;
   }
 //定义相除的运算方法
   public double division(){
	   double d=(double)n1/n2;
	   return d;
   }
   
}
