package com.ruicai.jihe.test;

import java.util.ArrayList;
import java.util.List;

import com.ruicai.jihe.entity.Work11;

public class Work1 {
   public Work1(String string, int i) {
		// TODO Auto-generated constructor stub
	}

public Work1() {
	// TODO Auto-generated constructor stub
}

	/*1，在项目中创建类,
    * 在主方法中实例化集合对象，
    * 并向集合中添加元素，
    * 最后将集合中的对象以String形式输出。
    */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List <Work11> list=new ArrayList <Work11>();
       Work11 work=new Work11("小张",23);
       Work11 work1=new Work11();
       work1.setName("小刚");
       work1.setAge(26);
       list.add(work);
       list.add(work1);
       for (Work11 w : list) {
		System.out.println(w.getName()+"---"+w.getAge());
	}
	}

}
