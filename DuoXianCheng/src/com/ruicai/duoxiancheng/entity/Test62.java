package com.ruicai.duoxiancheng.entity;

public class Test62 implements Runnable{
   private  Test61 stu;
   private int x=0;
   public Test62(Test61 stu){
	   this.stu=stu;
   }
	@Override
	public void run() {
		while(true){
			synchronized (stu) {
			if(stu.flg){
				try {
					stu.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
			
			if(x%2==0){
				stu.name=("小刚");
				stu.age=18;
			}else{
				stu.name=("小王");
				stu.age=28;
			}
			x++;
			stu.flg=true;
			stu.notify();
			}
		}// TODO Auto-generated method stub
		
	}
          
}
