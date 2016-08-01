package com.ruicai.duoxiancheng.money;

public class Demo {

	public static void main(String[] args) {
	    AtmMoney sumMoney=new AtmMoney(1000);
		GetMoneyThread gt=new GetMoneyThread(sumMoney,100);
		Thread th=new Thread(gt ,"天煞1");
		Thread th1=new Thread(gt ,"天煞2");
		Thread th2=new Thread(gt,"天煞3");
		
		th.start();
		th1.start();
		th2.start();
	}

}
