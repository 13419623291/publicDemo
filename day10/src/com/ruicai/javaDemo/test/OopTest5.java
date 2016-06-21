package com.ruicai.javaDemo.test;

public class OopTest5 {
   /**
    * 1：方法可以传递多个参数，每个参数用逗号隔开
    * 2： 传递参数之后，参数的值互不影响
    * 
    * 
    *  
    * @param args
    */
	public static void main(String[] args) {
		int a=3;
		int b=5;
		OopTest5 ot5 =new OopTest5();
		ot5.test(a, b);		
		System.out.println("执行test方法之后"+a+"-----"+b);
		
	}
	
	/**
	 * 传递两个参数
	 * @param a
	 * @param b
	 * 
	 */
	public void test(int i,int j){
		System.out.println("初始a值"+i+"初始b的值"+j);
		int tmp =i;
		i=j;
		//tmp=b;
		j=tmp;
		
		System.out.println("值交换后"+i+">>>>>"+j);
		
		
	}
	
}
