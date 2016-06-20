package com.ruicai.duoxiancheng.entity;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * lock锁的应用---->lock一个接口
 */
public class Test51 implements Runnable{
	private int piao=100;
    private Lock lock=new ReentrantLock();
	public void run() {
		while(true){
			lock.lock();//获取锁
			if(piao>0){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"正在卖第"+piao--+"张票");			
			  }
			lock.unlock();//释放锁
		}
	}
}
