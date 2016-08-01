package com.ruicai.duoxiancheng.work;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//假如说火车票总共是20张，如何用程序来模拟四个售票点同时卖票的功能。
class DemoRunnable implements Runnable{
    private int piao=20;
    private Object obj=new Object();
    boolean flg=true;
    Lock lock=new ReentrantLock();
	public void run() {
		while(true){
			lock.lock();
			if(piao>0){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"正在卖第"+piao--+"张票"+"---剩余"+piao+"张票");			
			  }else{
				 System.out.println("the tickets have been sold out");
				 //flg=false;
				return;
			}
		    lock.unlock();
		}		
	}
	
}
public class Work3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoRunnable dr=new DemoRunnable();
		
		Thread th=new Thread(dr,"窗口一");
		Thread th2=new Thread(dr,"窗口二");
		Thread th3=new Thread(dr,"窗口三");
		Thread th4=new Thread(dr,"窗口四");
		
		th.start();
		th2.start();
		th3.start();
		th4.start();
		
	}

}
