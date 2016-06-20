package com.ruicai.duoxiancheng;

import com.ruicai.duoxiancheng.entity.Test61;
import com.ruicai.duoxiancheng.entity.Test62;
import com.ruicai.duoxiancheng.entity.Test63;

/*
 * 在供给关系中供方与输出方的对象及锁对象要保持一致
 */
public class Test6 {
     /*没加锁时出现了姓名：小刚年龄18
                     姓名：小刚年龄28
      * 的情况
      */
	public static void main(String[] args) {
		// 创建学生对象
		Test61 stu=new Test61();
		//创建供方对象 此时要把stu对象传入所以该类中需要一个构造方法及成员变量
		Test62 t62=new Test62(stu);
		//
		Test63 t63=new Test63(stu);
		Thread th=new Thread(t62);
		Thread th1=new Thread(t63);
		//启动线程
		th.start();
		th1.start();
		
	}

}
