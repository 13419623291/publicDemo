package com.ruicai.jihe.test;

import java.util.ArrayList;
import java.util.List;

public class Work5 {
   /*5，将1-100之间的所有正整数存放在一个List集合中，
    * 并将集合中索引位置是10的对象从集合中移除。
    */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List <Integer> list=new ArrayList <Integer>();
     int i = 1;
     for (; i <=100; i++) {
		list.add(i);
	}
    list.remove(10);
    System.out.println(list);
  }

}
