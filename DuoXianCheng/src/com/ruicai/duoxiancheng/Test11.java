package com.ruicai.duoxiancheng;

import com.ruicai.duoxiancheng.entity.Test111;

/**
 * 实现多线程的另外的一个方法：实现runable接口
 * @author Administrator
 *
 */
public class Test11 {

public static void main(String[] args) {
	//创建Test111的对象
	   Test111 t=new Test111();
	/**   
	 * 由于runable接口没有启动线程的方法所以还是得先创建thread类的方法来调用
	 */
	   //通过调用Thread类的Thread(Runnable target) 分配新的 Thread 对象。构造方法 
      
//	   Thread th=new Thread(t);
//	   Thread th1=new Thread(t);
//	   Thread th2=new Thread(t);
//	   th.setName("线程1");
//	   th1.setName("线程2");
//	   th2.setName("线程3");
	 //通过调用Thread类的Thread(Runnable target, String name) 分配新的 Thread 对象。构造方法
	   Thread th=new Thread(t,"线程1");
	   Thread th1=new Thread(t,"线程2");
	   Thread th2=new Thread(t,"线程3");
	   th.start();
	   th1.start();
	   th2.start();
	   
}
}
