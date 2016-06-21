package com.ruicai.duoxiancheng;

/**
 * 创建一个实现Runnable接口的实现类
 * 重写run方法
 * 创建其实现类的对象 传入 Thread th=new Thread(d);
 * @author Administrator
 *多线程的生命周期：新建（new），就绪（runnable），运行（running），阻塞（blocked），死亡（dead）
 * 当线程运行之后不能一直霸占cpu资源，cpu会在多个线程之间进行切换，
 * 线程的状态也会在运行和阻塞之间多次切换。
 * 新建，就绪状态解释：
 * New关键字，表示该线程对象已经新建好，
 * Start()方法，表示该线程已经就绪，已经可以运行了
 * 什么时候可以运行取决于JVM线程调度器
 * 运行和阻塞状态解释：
 * 调用了start方法的线程如果获取了CPU资源，则开始运行
 * 运行指的就是线程对象调用run方法
 */
public class Duo2 implements  Runnable{
	@Override
	public void run() {
		int sum=0;
        for (int i = 0; i < 10; i++) {
			sum+=i;
			System.out.println("子线程："+sum+"----"+Thread.currentThread().getName());
       }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		int sum=0;
        for (int i = 0; i < 10; i++) {
			sum+=i;
			System.out.println("主线程："+sum);
			//isAlive() 测试线程是否处于活动状态。true则为活动   false为死亡
			//currentThread() 返回对当前正在执行的线程对象的引用。
			if(Thread.currentThread().isAlive()){
				if(i==1){
				//创建该实现类的对象
					Duo2 d=new Duo2();
		      //创建Runnable接口的实现类对象
				Thread th=new Thread(d,"0到9的回忆");
				//就绪
				th.start();
			}	
		 }		
       }

	}

}
