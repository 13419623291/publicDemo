package com.ruicai.duoxiancheng.entity;

import java.util.Date;

public class Test21 extends Thread {
	 public void run() {
	       for(int i=0;i<=1000;i++){
	    	   System.out.println(getName()+":"+i+",时间"+new Date());
	    	   try {
				Test21.sleep(0);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	       }
	 }      
}

