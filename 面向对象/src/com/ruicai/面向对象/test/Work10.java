package com.ruicai.面向对象.test;

import com.ruicai.面向对象.entity.Work10Addition;

/*编写Addition类，该类中应包含一组实现两数相加运算的重载方法。
实现加法运算的方法，应接受两个参数（即加数和被加数），方法将两个参数进行加法运算后，返回相加结果。
考虑可能针对不同的数据类型进行计算，重载一组方法，包括整型、长整型、浮点型、双精度浮点型、还有字符串。
在main方法中创建Addition类的实例，分别调用重载方法测试其效果。
应将Addition类打入到包中，以自己名字的拼音为包命名。 
 */
public class Work10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Work10Addition num=new Work10Addition();
		System.out.println("两整型相加结果为："+num.add(34,67));
		System.out.println("两长整型相加结果为："+num.add(78L,67L));
		System.out.println("两浮点数相加结果为："+num.add(5.943f,8.48748f));
		System.out.println("两双精度浮点数相加结果为："+num.add(45.4657467,124.765835));
		System.out.println("两字符串相加结果为："+num.add("abcd","efgh"));
	}

}
