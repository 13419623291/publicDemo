package com.ruicai.jihe.test;

import java.util.ArrayList;
import java.util.List;

import com.ruicai.jihe.entity.Work21;

public class Work2 {
    /*2，在项目中创建类，在主方法中创建集合对象
     * ，通过Math类的random()方法随机获取集合中的某个元素，
     * 然后移除数组中索引位置是“2”的元素，最后遍历数组。
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Work21> list=new ArrayList<Work21>();
        list.add(new Work21("tom"));
        list.add(new Work21("java"));
        list.add(new Work21("hello"));
        list.add(new Work21("work"));
        list.add(new Work21("javaSE"));
        int n=list.size();
        int num=(int)(Math.random()*5);
        Work21 w=(Work21)list.get(num);
        System.out.println("随机获取的元素为"+w.getName());
        list.remove(2);
        for (Work21 work21 : list) {
			System.out.println("移除后的元素"+work21.getName());
		}
        
        
	}

}
