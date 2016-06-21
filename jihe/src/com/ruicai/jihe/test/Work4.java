package com.ruicai.jihe.test;

import java.util.ArrayList;
import java.util.List;

import com.ruicai.jihe.entity.User;

public class Work4 {
// 4，在刚刚创建的类中，通过下标索引，循环打印出所有对象信息。
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      List <User> list=new ArrayList <User>();
	      User user=new User("小刚","武汉",26);
	      User user1=new User("小张","黄石",30);
	      User user2=new User("小谢","宜昌",34);
	      list.add(user);
	      list.add(user1);
	      list.add(user2);
	      for (int i = 0; i < list.size(); i++) {
	    	  User u=(User)list.get(i);
	    	System.out.println(u.getName()+"--"+u.getId()+"--"+u.getAge());  
		}
	}

}
