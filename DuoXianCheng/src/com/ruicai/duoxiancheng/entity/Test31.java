package com.ruicai.duoxiancheng.entity;

import java.util.Date;

public class Test31 extends Thread {
	 public void run() {
	       
	    	   System.out.println("线程开始了"+new Date());
	    	   try {
				Test21.sleep(10000);
			} catch (InterruptedException e) {
				
				System.out.println("程序即将终止");;
			}
	    	   System.out.println("线程已终止"+new Date());
	       }
	 }

