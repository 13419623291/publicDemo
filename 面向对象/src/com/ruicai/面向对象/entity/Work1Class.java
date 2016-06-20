package com.ruicai.面向对象.entity;

public class Work1Class {
	//定义私有成员变量
      private int v=100;
      //定义判断运算方法  并输出结果
      public void bi(int v1){
    	  if(v1>v){
    		  System.out.println("您猜的数字大了");
    	  }else if(v1<v){
    		  System.out.println("您猜的数字小了");
    	  }else{
    		  System.out.println("恭喜您，猜对了");
    	  }
      }
      
}
