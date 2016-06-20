package com.ruicai.duoxiancheng;

import com.ruicai.duoxiancheng.entity.Test21;

/**
 * 更改线程的优先级
 * @author Administrator
 *
 */
public class Test2 {
    public static void main(String[] args) throws InterruptedException {
    	 Test21 t=new Test21();
         Test21 t1=new Test21();
         Test21 t2=new Test21();
    	  t.setName("线程1");
          t1.setName("线程2");
          t2.setName("线程3");
          //查看当前线程对象
         // System.out.println(Thread.currentThread().getName());
          //查看默认优先级
//          System.out.println(t.getPriority());
//          System.out.println(t1.getPriority());
//          System.out.println(t2.getPriority());
          //设置优先级（最大为10   最小为1）
//          t.setPriority(10);
//          t1.setPriority(1);
//          t2.setPriority(5);
        //调用strat方法启动线程
          //加入线程调用t.join();方法当t执行完了才执行其它线程
          //礼让线程调用yield()方法 暂停当前正在执行的线程对象，并执行其他线程。
          
         
        t.start();
        t.join();
        t1.start();
        t2.start();
	}
}
