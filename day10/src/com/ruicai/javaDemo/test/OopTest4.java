package com.ruicai.javaDemo.test;
/**
 *  java里面： 
 *  
 * @author Administrator
 *
 */
public class OopTest4 {
    String name="Mick";
	public static void main(String[] args) {
		
		OopTest4 ot4 =new OopTest4();
		ot4.print("CaiWei");
		
	}
	
	
	public void print(String name){
		System.out.println("类的属性"+this.name);
		System.out.println("方法内部的属性"+name);
	}
}












