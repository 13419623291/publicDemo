package com.ruicai.duoxiancheng.entity;

public class Test11 extends Thread{
       public  Test11() {
		
	}
       public  Test11(String name) {
		   super(name);
	}
    public void run() {
       for(int i=0;i<=1000;i++){
    	   System.out.println(getName()+":"+i);
       }
    }
}
