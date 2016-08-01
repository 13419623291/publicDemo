package com.ruicai.duoxiancheng.money;

public class GetMoneyThread implements Runnable{
    private AtmMoney money;
    private double  outMoney;
    private Object obj=new Object();
    
	public GetMoneyThread(AtmMoney money, double outMoney) {
		this.money = money;
		this.outMoney = outMoney;
	}
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	public void run() {
//		synchronized (obj) {
		while(money.saveMoney()>=outMoney){
			synchronized (obj) {	
//		System.out.println("当前"+Thread.currentThread().getName()
//				+"的账户余额"+money.saveMoney());
		System.out.println("账户余额："+money.saveMoney()+"当前"+Thread.currentThread().getName()+"取款金额"+money.getMoney(outMoney)+"当前账户余额："+money.saveMoney());
		
		}
	}
  }
//	public void run() {
////		synchronized (this) {
//		while(money.saveMoney()>=outMoney){
//		  if(money.saveMoney()>=500){
//		 synchronized (this) {	
////		     System.out.println("当前"+Thread.currentThread().getName()
////				+"的账户余额"+money.saveMoney());
//		     System.out.println("当前"+Thread.currentThread().getName()+"取款金额"+money.getMoney(outMoney)+"当前账户余额："+money.saveMoney());
//		
//		}
//	  }else{
//		  test();
//	  }
//     }
////	}
//  } 
//	private void test(){
//		if(money.saveMoney()>0){
////			synchronized (this) {	
//			System.out.println("当前"+Thread.currentThread().getName()+"取款金额"+money.getMoney(outMoney)
//		+"当前账户余额："+money.saveMoney());
//		}
////	  }
//	}
	
	
	
	
	
	
}
	