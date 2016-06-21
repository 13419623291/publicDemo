package com.ruicai.javaDemo.test;

import com.ruicai.javaDemo.entity.People;

public class OopTest2 {
   public static void main(String[] args) {
	  /**
	   *  计算机的数据：没有持久化【IO/Mysql/Oracle】之前保存在内存中
	            内存： 栈和堆
	           类   引用【对象】=new 类【类的构造方法】
	      new:调用前面指定的类的构造方法
	      构造方法：
	      1：java会为每个实体类提供一个默认的无参的构造方法
	      2: 如果我需要给对象初始化[对象有数据了]，需要在构造器指定参数
	      
	      
	   */
	   People  liFaQiang = new People();
	   System.out.println(liFaQiang.address);
	   
	   People  wangZhengPeng =new People("wangzhengpeng", "hubei", "da");
	  
	   System.out.println(wangZhengPeng.address);
	   liFaQiang.getUserType();//获取理发强的类型
	   
	   
	   
	   
	   
  }
}
