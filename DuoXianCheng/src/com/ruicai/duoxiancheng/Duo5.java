package com.ruicai.duoxiancheng;
/**
 * 多线程的优先级
 *  intgetPriority() 返回线程的优先级。
 *  void setPriority(int newPriority) 更改线程的优先级 
 *  static int MAX_PRIORITY 线程可以具有的最高优先级。 
    static int MIN_PRIORITY 线程可以具有的最低优先级。 
    static int NORM_PRIORITY 分配给线程的默认优先级。 
 */
class Duo51 extends Thread{
	public void run() {
      for (int i = 0; i <10; i++) {
		System.out.println("当前线程："+this.getName()+"---"+i+"当前线程优先级："
            +this.getPriority());
	}
  }
	
}
public class Duo5 {

	public static void main(String[] args) {
		Duo51 d=new Duo51();
		Duo51 d1=new Duo51();
		d.setPriority(d.MAX_PRIORITY);
		d1.setPriority(d.MIN_PRIORITY);
		d.start();
		d1.start();
	}

}
