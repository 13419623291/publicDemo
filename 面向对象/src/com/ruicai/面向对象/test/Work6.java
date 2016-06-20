package com.ruicai.面向对象.test;
/**
 * 定义一个类，该类有一个私有成员变量，通过构造方法将其进行赋初值，并提供该成员的getXXX()和setXXX()方法
提示：假设有private String name;则有
public void setName(String name){
	this.name = name;
}

public String getName(){
	return this.name;
}
 */
import com.ruicai.面向对象.entity.Work6Class;

public class Work6 {

	public static void main(String[] args) {
		// 利用构造方法创建对象
		Work6Class car=new Work6Class();
		//通过对象调用方法对其赋值
		car.setCar("路虎");
		//打印结果
		System.out.println("车的型号为："+car.getCar());
	}

}
