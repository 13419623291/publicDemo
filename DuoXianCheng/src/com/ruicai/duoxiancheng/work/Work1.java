package com.ruicai.duoxiancheng.work;
/**
 * 1.编写一个多线程类，该类的构造方法调用Thread类带字符串参数的构造方法。
 * 建立自己的线程名，然后随机生成一个休眠时间，
 * 再将自己的线程名和休眠多长时间显示出来。
 * 该线程运行后，休眠一段时间，该时间就是在构造方法中生成的时间。
 * 最后编写一个测试类，创建多个不同名字的线程，并测试其运行情况。
 */
class TestThread extends Thread{
	//定义时间属性
    private int    time;
	public TestThread(String name) {
		super(name);
		this.time=(int)(1000+Math.random()*9999);
	}
	//重写run方法
	public void run(){
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("线程名："+this.getName()+"   休眠时间:"+time+"ms");
	}
	
}
public class Work1 {

	public static void main(String[] args) {
		//创建对象
		TestThread tt=new TestThread("张三");
		TestThread tt1=new TestThread("李四");
		TestThread tt2=new TestThread("王五");
		//准备启动线程
		tt.start();
		tt1.start();
		tt2.start();
	}

}
