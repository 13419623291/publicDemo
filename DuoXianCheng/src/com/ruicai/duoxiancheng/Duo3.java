package com.ruicai.duoxiancheng;
class Duo31 implements Runnable{
	public void run(){
        for (int i = 0; i < 10; i++) {
			System.out.println("子线程："+i+"----"+Thread.currentThread().getName());
       }
	}
	
}
public class Duo3 extends Thread{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread th=new Thread(new Duo31(),"main的小弟" );
		th.start();
		for (int i = 0; i < 10; i++) {			
			if(i==0){
				th.join();
			}		
			System.out.println("主线程："+i+"----"+Thread.currentThread().getName());
       }
	}

}
