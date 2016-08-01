package com.ruicai.duoxiancheng;
/**守护线程
 * setDaemon(boolean on) 将该线程标记为守护线程或用户线程。
 *setDaemon(boolean on) 将该线程标记为守护线程或用户线程。
 *守护线程：子线程设置为后台线程 存在于主线程中
 *主线程执行完毕就死亡了而此时守护线程也不会执行完毕
 *
 */
public class Duo6 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duo6 d=new Duo6();
		d.setDaemon(true);
		d.start();
		System.out.println("是否为守护线程："+d.isDaemon());
		for (int i = 0; i <10; i++) {
		  System.out.println("当前线程："+Thread.currentThread().getName()+"---"+i);
		}
	}

	@Override
	public void run() {
		 for (int i = 0; i <100; i++) {
		   System.out.println("子线程："+this.getName()+"---"+i);
	}
    
  }
}
