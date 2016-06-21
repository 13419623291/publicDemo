package com.ruicai.javaDemo.test;

import com.ruicai.javaDemo.entity.People;

public class OopTest6 {
   
	public static void main(String[] args) {
		People huBiao =new People();
		huBiao.address="孝感";
		// private:表示封装，被private修饰的只能在类的内部使用
		huBiao.handSome="宋仲基";
		huBiao.eat("大嘴");
				
		
	}
}
