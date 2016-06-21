package com.ruicai.javaDemo.test;

import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;

import com.ruicai.javaDemo.entity.People;

/**
 * 
 * @author 
 * java是一个【面向对象】的软件开发语言：
 * 什么是面向对象？
 * 
 * 面向对象是一种编程思想，它是面向过程的发展。
 * 越来越多的语言支持面向对象，
 * PHP，zend 
 * 
 * 面向对象是java所独有的吗？
 * 
 * 它是一种思想，有ruby,c# php,... 支持面向对象的
 * 
 * 面向对象到底是什么？
 * 两个核心：类和对象
 * 三个方面：封装，继承，多态
 * -------------
 * java开发----》类class
 * 
 * java开发中类分为两大类：
 * 1：普通java业务逻辑类
 * 2：实体类。---》所有的java类都称为javaBean
 *    注意：在entity/domain/model层下，
 *        提供封装的属性并且为
 *        每个属性提供get set方法的类称为JavaBean
 * ---------------------       
 * 类：一组规范----》抽象
 * 对象：【东西】   ---》对象是类的实例---》具体
 * 
 * 
 * -------------
 * 
 * java中的类如果是业务逻辑类，创建对象没意义
 * 创建对象的是实体类
 * 
 * 
 * 
 *
 */
public class OopTest {
     
	/**
	 *  调用同一个方法，为什么会产生不同的结果？
	 *  实参：String leiboMouth ="我喜欢用小嘴吃饭";
	 *  形参   String mouth 
	 *  调用一个方法的时候，要按照方法定义的参数的形式传递实际参数
	 *  ---
	 *  String mouth;//形参
	    mouth="小嘴";//实参
	 *  
	 * @param args
	 */
	public static void main(String[] args) {
//		//创建雷波
//		People leibo =new People();
//		People zhouYong =new People();
//		
//		//雷波吃饭
//		//leibo.eat();
//		String leiboMouth ="我喜欢用小嘴吃饭";
//	    String leiboResult=leibo.eat(leiboMouth);//得到返回值
//	    String zhouYongMouth ="我喜欢用大嘴吃饭";
//	    zhouYong.eat(zhouYongMouth);
//	    String zhouYongResult =zhouYong.eat(zhouYongMouth);
//	    System.out.println(zhouYongResult);
////	    Scann er scan =new Scanner(System.in);
////	    //请输入您的年龄
////	    int age= scan.nextInt();
////	    //打印你的年龄
////	    System.out.println(age);
//	    System.out.println(leiboResult);
	    
   
	    
	    
		
		
	}
}
