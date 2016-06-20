package com.ruicai.面向对象.test;

import com.ruicai.面向对象.entity.Work7WuMingFen;

/*为“无名的粉”写一个类：class WuMingFen 要求：
1.有三个属性：面码:String theMa  粉的分量(两)：int quantity 
	      是否带汤：boolean likeSoup
2.写一个构造方法，以便于简化初始化过程，如：
	WuMingFen f1 = new WuMingFen("牛肉",3,true);
3.重载构造方法，使得初始化过程可以多样化：
	WuMingFen f2 = new WuMingFen("牛肉",2);
4.如何使得下列语句构造出来的粉对象是酸辣面码、2两、带汤的？
	WuMingFen f3 = new WuMingFen();
5.写一个普通方法：check()，用于查看粉是否符合要求。即：将对象的三个属性打印在控制台上
  */
public class Work7 {
	public static void main(String[] args) {
		//
		Work7WuMingFen f1=new Work7WuMingFen("牛肉",3,true);
		Work7WuMingFen f2=new Work7WuMingFen("牛肉",2);
		Work7WuMingFen f3=new Work7WuMingFen();
		f3.setTheMa("酸辣面");
		f3.setQuantity(2);
		f3.setLikeSoup(true);
		f1.check();
		f2.check();
		System.out.println(	"面码:"+f3.getTheMa()+"\n分量:"+f3.getQuantity()+"两"+"\n是否带汤："+f3.gatLikeSoup());
		
	}

}
