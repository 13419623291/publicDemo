package com.ruicai.duoxiancheng;
class Duo41 implements Runnable{
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {			
			if(i==5){
				Thread.currentThread().yield();				
			}
			System.out.println("子线程："+i+"----"+Thread.currentThread().getName());
	}
  }
}
public class Duo4 {
	public static void main(String[] args) {
		Thread th=new Thread(new Duo41(),"孔融");
		Thread th1=new Thread(new Duo41(),"孔融的兄弟");
		th.start();
		th1.start();
	}
}


	


