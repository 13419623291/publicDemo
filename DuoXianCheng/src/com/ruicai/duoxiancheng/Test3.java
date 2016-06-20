package com.ruicai.duoxiancheng;

import com.ruicai.duoxiancheng.entity.Test31;

public class Test3 {
  public static void main (String []args){
	  /**
	   * public void interrupt()中断线程。 
	   */
	  Test31 t=new Test31();
	  t.start();
	  try {
		Thread.sleep(3000);
		t.interrupt();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
}
