package com.ruicai.duoxiancheng.entity;

public class Test111 implements  Runnable {
	
	
	public void run() {
		 for(int i=0;i<=1000;i++){
			 /**由于runable接口中没有getName方法
			  * 所以只有通过Thread类调用其currentThread()方法来获取当前线程对象
			  * 通过获取的对象来调取getName方法
			  */
	    	   System.out.println(Thread.currentThread().getName()+":"+i);
	}

  }
}
