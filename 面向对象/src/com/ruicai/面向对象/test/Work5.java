package com.ruicai.面向对象.test;

import com.ruicai.面向对象.entity.Work5Person;

/**
 * 编写Java程序，用于显示人的姓名和年龄。
 * 定义一个人类（Person），该类中应该有两个私有属性，姓名（name）和年龄（age）。
 * 定义构造方法，用来初始化数据成员。再定义显示（display）方法，将姓名和年龄打印出来。
 * 在main方法中创建人类的实例，然后将信息显示。
 */
public class Work5 {

	public static void main(String[] args) {
		//通过构造方法创建对象同时为其赋值
		Work5Person  people=new Work5Person("小张",18);
		//利用对象调用方法 输出结果
		people.display();
	}
}
