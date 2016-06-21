package com.ruicai.jihe.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ruicai.jihe.entity.User;

public class Work3 {
	/*3，在项目中创建一个User类自定义几个属性信息
	 * ，在主方法中new出三个不同的User对象，
	 * 创建集合对象存储刚刚新建的三个User对象。
	 */
	public static void main(String[] args) {	
		// TODO Auto-generated method stub
      List <User> list=new ArrayList <User>();
      User user=new User("小刚","武汉",26);
      User user1=new User("小张","黄石",30);
      User user2=new User("小谢","宜昌",34);
      list.add(user);
      list.add(user1);
      list.add(user2);

	}
}
