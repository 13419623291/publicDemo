package com.ruicai.duoxiancheng.work;
/**
 * 编写多线程应用程序，模拟多个人通过一个山洞的模拟。
 * 这个山洞每次只能通过一个人，每个人通过山洞的时间为5秒，
 * 随机生成10个人，同时准备过此山洞，显示一下每次通过山洞人的姓名
 */
class DRunnable implements Runnable{

    private Object obj=new Object();
    //重写run方法
	public void run() {
     while(true){
    	 	  synchronized (obj) {
    	 		  
		 System.out.println(Thread.currentThread().getName()+"正在穿越山洞");
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	  }
		System.out.println(Thread.currentThread().getName()+"已经穿越山洞");
   }
  }	
 }
	
}
public class Work4 {

	public static void main(String[] args) {
		// 创建对象
		DRunnable dr=new DRunnable();
		
		Thread th=new Thread(dr,"秦始皇");
		Thread th2=new Thread(dr,"刘秀");
		Thread th3=new Thread(dr,"刘寅");
		Thread th4=new Thread(dr,"刘备");
		Thread th5=new Thread(dr,"刘锋");
		Thread th6=new Thread(dr,"卫温");
		Thread th7=new Thread(dr,"刘彻");
		Thread th8=new Thread(dr,"施琅");
		Thread th9=new Thread(dr,"载沣");
		Thread th10=new Thread(dr,"俞大猷");
		
		th.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		th6.start();
		th7.start();
		th8.start();
		th9.start();
		th10.start();
		
		

	}

}
