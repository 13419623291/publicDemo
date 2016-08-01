package com.ruicai.duoxiancheng.money;
//创建一个账户类
public class AtmMoney {
    /*
     * synchronized 英 ['sɪŋkrənaɪz]  美 ['sɪŋkrə.naɪz] 同步的，同步化，同步方法
     */
	//定义一个总钱的变量
    private double sumMoney;
    //定义一个构造方法
    
	public AtmMoney(double sumMoney) {
		this.sumMoney = sumMoney;
	}
	//定义一个存钱的方法
	void  addMoney(double money){
		sumMoney=sumMoney+money;
	}
    //定义一个取钱的方法
	double getMoney(double money){
		if(sumMoney>=money){
			sumMoney=sumMoney-money;
			return money;
		}else{
			System.out.println("当前余额不足，您的当前余额为："+sumMoney);
			return sumMoney;
		}
  }
	//查看余额
	double saveMoney(){
		return  sumMoney;
	}
}
