package com.ruicai.duoxiancheng.entity;

public class Test63 implements Runnable{
	 private  Test61 stu;
	   public Test63(Test61 stu){
		   this.stu=stu;
	   }
	@Override
	public void run() {
		while(true){
			synchronized (stu) {
			if(!stu.flg){
				try {
					stu.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("姓名："+stu.name+"年龄"+stu.age);
			stu.flg=false;
			stu.notify();//唤醒机制
			}
		}// TODO Auto-generated method stub
		
	}

}
