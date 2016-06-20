package com.ruicai.duoxiancheng;

import com.ruicai.duoxiancheng.entity.Test11;

public class Test1 {
     /**
      * 多线程的演示及命名方式
      * @param args
      */
	public static void main(String[] args) {
		// 创建对象 一个对象不能调用两次线程  所以需要创建两个对象来实现多线程
       Test11 t=new Test11();
       Test11 t1=new Test11();
       /**给线程命名有两种方法
        * 1.在线程程序中调用getName方法此时是系统默认的
        * 2.自己通过构造方法或调用getxxx、setxxx方法命名
        */
       //通过构造方法
//		Test11 t=new Test11("线程1");
//		Test11 t1=new Test11("线程2");
       //调用getxxx、setxxx方法命名
//       t.setName("线程1");
//       t1.setName("线程2");
       //调用strat方法启动线程
       t.start();
       t1.start();
       
	}

}
