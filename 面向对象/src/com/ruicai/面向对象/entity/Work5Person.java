package com.ruicai.面向对象.entity;
/**
 * 编写Java程序，用于显示人的姓名和年龄。
 * 定义一个人类（Person），该类中应该有两个私有属性，姓名（name）和年龄（age）。
 * 定义构造方法，用来初始化数据成员。再定义显示（display）方法，将姓名和年龄打印出来。
 * 在main方法中创建人类的实例，然后将信息显示。
 */
public class Work5Person {
	//定义私有成员变量
   private String name;
   private int age;
   //定义带参的构造方法
public Work5Person(String name, int age) {
	this.name = name;
	this.age = age;
}
//定义输出方法 并输出数据
public void display(){
    System.out.println("姓名："+name+"\n年龄:"+age);
}
   
}
