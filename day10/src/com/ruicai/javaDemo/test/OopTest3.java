package com.ruicai.javaDemo.test;

import com.ruicai.javaDemo.entity.People;

public class OopTest3 {
     static String userName="王大锤";
     int a=3;//成员变量
     static int c=6;
     /**
      * 如果一个变量或者方法是静态的，那么调用的时候直接使用类名去点.[调用]
      * 非静态的要通过对象去调用。
      * 
      * 
      * @param args
      */
	public static void main(String[] args) {
		
		People  caiWei =new People();
	//	caiWei.address ="aaa";
		String userName="caiWei";
		caiWei.testGrade(userName);
		System.out.println("打印成绩"+OopTest3.userName);
		OopTest3 ot=new OopTest3();
		ot.a=5;
		
		int b=1;
		test(b);
	}
	/**
	 *  局部变量：
	 *  1：作用域是方法内部
	 *  2：如果想在方法外部获取该值，可以通过方法传递参数
	 *  -----------------------
	 *  成员变量：静态的成员变量，非静态的成员变量
	 *  a是一个成员变量，
	 *  1： 静态【static】的东西不能使用非静态的东西
	 *  
	 *  
	 * @param b
	 */
	
	public static void test(int b){
		//b是属于局部变量，它的作用域在方法内部，
		//  怎么样在test这个方法里面使用b呢？
	//	System.out.println(b);
		System.out.println(b);
	//	System.out.println(a);
		System.out.println(c);
	}
	
	
	
	
}
