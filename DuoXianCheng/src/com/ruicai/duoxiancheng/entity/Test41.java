package com.ruicai.duoxiancheng.entity;

import javax.management.loading.PrivateClassLoader;

public class Test41 implements  Runnable {
	
	private  static int piao=100;
	private int x=0;
	/*由于没有加入限定条件所以出现了
	 * 窗口2正在卖第-1张票
        窗口1正在卖第0张票
	 * 的情况
	 */
//	Object obj=new Object();
//	public void run() {
//		while(true){//同步代码块的锁对象可以是任意的
//			synchronized (obj) {
//			if(piao>0){
//				try {
//					Thread.sleep(100);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				System.out.println(Thread.currentThread().getName()+"正在卖第"+piao--+"张票");			
//			  }
//			}
//			public void run() {
//				while(true){//同步非静态方法锁对象是this
//					if(x%2==0){
//						synchronized (this) {
//							if(piao>0){
//								try {
//									Thread.sleep(100);
//								} catch (InterruptedException e) {
//									e.printStackTrace();
//								}
//								System.out.println(Thread.currentThread().getName()+"正在卖第"+piao--+"张票");			
//							  }
//					     }
//					}else{
//						demo();
//					}
//					x++;
//				}
//			}
			
//		private synchronized void demo(){
//					if(piao>0){
//						try {
//							Thread.sleep(100);
//						} catch (InterruptedException e) {
//							e.printStackTrace();
//						}
//						System.out.println(Thread.currentThread().getName()+"正在卖第"+piao--+"张票");			
//					  }
//	}
		public void run() {
			while(true){//同步非静态方法锁对象是类的字节码（类名.class）
				if(x%2==0){
					synchronized (Test41.class) {
						if(piao>0){
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							System.out.println(Thread.currentThread().getName()+"正在卖第"+piao--+"张票");			
						  }
				     }
				}else{
					//demo();
					demo2();
				}
				x++;
			}
		}
		private static synchronized void demo2(){
			if(piao>0){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"正在卖第"+piao--+"张票");			
			  }
}

    
}
