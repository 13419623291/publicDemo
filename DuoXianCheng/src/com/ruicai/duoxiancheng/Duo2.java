package com.ruicai.duoxiancheng;

/**
 * 创建一个实现Runnable接口的实现类
 * 重写run方法
 * 创建其实现类的对象 传入 Thread th=new Thread(d);
 * @author Administrator
 *多线程的生命周期：新建（new），就绪（runnable），运行（running），阻塞（blocked），死亡（dead）
 *
 */
public class Duo2 implements  Runnable{
	@Override
	public void run() {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		int sum=0;
        for (int i = 0; i < 10; i++) {
			sum+=i;
			System.out.println("主线程："+sum);
			if(i==1){
				//创建该实现类的对象
				Duo1 d=new Duo1();
		      //创建Runnable接口的实现类对象
				Thread th=new Thread(d);
				//启动线程
				th.start();
			}
       }

	}

}
