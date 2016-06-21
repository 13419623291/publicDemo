package com.ruicai.duoxiancheng;
/**线程：Thread
 * 多线程：例如：多个柜台，多个车道
 * 单线程：例如：一个柜台，一条车道
 * 假设情景：银行柜台取钱，马路车道，
 * 引入多线程最直接的影响：提高java程序的数据处理能力
 * @author Administrator
 *java是为生活服务的，学习任何一个技术要考虑生活的场景
 *实现线程：1.继承Thread类    2.实现Runnable接口
 *多线程的执行时资源抢占式，执行结果是随机的
 */
public class Duo1 extends Thread{
    /**多线程里，主线程是main方法
     *           子线程是自己定义的线程
     *继承一个类           
     * 重写run方法[这是子线程要做的事]
     * run方法时多线程的执行体
     * 可创建多个线程对象
     * 
     */
	@Override
	public void run() {
	    int sum=0;
        for (int i = 0; i < 10; i++) {
			sum+=i;
			System.out.println("子线程：----"+sum+getName());
		}
	}

	public static void main(String[] args) {		
		// 1.获取当前线程2.获取线程的名称
        System.out.println(Thread.currentThread().getName());
        int sum=0;
        for (int i = 0; i < 10; i++) {
			sum+=i;
			System.out.println("主线程："+sum);
			if(i==1){
				//创建线程对象，可创建多个
				Duo1 d=new Duo1();
		      //d.setName("子线程");
				//启动线程
				d.start();
			}
		}
	}

}
