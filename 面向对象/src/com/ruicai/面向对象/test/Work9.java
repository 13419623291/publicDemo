package com.ruicai.面向对象.test;

import java.util.Scanner;

import com.ruicai.面向对象.entity.Work9Class;

/*定义一个网络用户类，要处理的信息有用户ID、用户密码、email地址。
  * 在建立类的实例时，把以上三个信息都作为构造函数的参数输入，
  * 其中用户ID和用户密码时必须的，
  * 缺省的email地址是用户ID加上字符串"@gameschool.com" 
  */
public class Work9 {
	public static void main(String[] args) {		
		Work9Class work=new Work9Class("2435","5465"," ");
        //System.out.println(work.toString());
		work.out();
	}

}
