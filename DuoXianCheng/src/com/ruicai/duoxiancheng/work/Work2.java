package com.ruicai.duoxiancheng.work;
/**
 * 2.使用继承Thread类方法设计多线程程序，
 * 线程AThread计算并输出1-1000之内的素数；
 * 线程 BThread输出200个随机的整数。
 */
class Demo implements Runnable{

	private Object obj=new Object();
	//重写run方法
	public void run() {
			for (int i = 1; i <=200; i++) {
				int num=(int)(1+Math.random()*500);
				System.out.println(Thread.currentThread().getName()+"输出第"+i+"个随机数是："+num);
			}
	}	
}
public class Work2 extends Thread{

	public static void main(String[] args) {
		// 创建对象
		Work2 demo=new Work2();
		Demo demo1=new Demo();
		//定义线程名称
		demo.setName("AThread");
		Thread th=new Thread(demo1,"BThread");
		//准备启动
		demo.start();
		th.start();
	}
	//重写run方法
	public void run(){
		   int j;
	       for(int i=2;i<=1000;i++){
	    	   for(j=2;j<=i;j++){
	    		   if(i%j==0){
	    			   break;
	    		   }
	    		 }if(j==i){
	    			   System.out.print(this.getName()+"输出质数："+i);
	    	   }
		}
	}
}
