package com.ruicai.day161;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		// 创建集合list
        List <Integer> list=new ArrayList <Integer>();
        //向集合中添加重复的元素
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(3);
        //第一种方法
        //遍历集合并判断，若当前元素与其他元素相同则移除其他元素反之保留
        for (int i = 0; i < list.size()-1; i++) {
			for (int j = i+1; j <list.size(); j++) {
				if(list.get(i)==list.get(j)){
					list.remove(j);
					j--;
				}
			}			
		}
        //遍历经过筛选的数组
        Iterator<Integer> it=list.iterator();
        while (it.hasNext()){
        	int num=it.next();
        	System.out.println(num);
        }
        System.out.println("----------------------------");
        /*第二种方法
         * 创建一个新的集合
         */
        Set <Integer> set=new HashSet<Integer>();
        //将list集合添加到新集合中
        set.addAll(list);
        //遍历新集合
        for (Integer integer : set) {
			System.out.println(integer);
		}
        System.out.println("----------------------------");
        /*第三种方法
         * 1.创建一个新的ArrayList集合
         * 2.利用集合的构造方法将一个HashSet集合传入新集合中
         * 3.利用集合的构造方法list集合传入HashSet集合中
         */
        List<Integer> num=new ArrayList<Integer>(new HashSet<Integer>(list));
        //遍历新集合
        for (Integer integer : num) {
        	System.out.println(integer);
		}
        System.out.println("----------------------------");
        /*第四种方法
         * 创建新集合
         */
        List <Integer> newList=new ArrayList<Integer>();
        //遍历list集合并通过新集合比较，若新集合中不包含该元素则添加该元素
        Iterator<Integer> ite=list.iterator();
        while (ite.hasNext()){
           int i=ite.next();
           if(!newList.contains(i)){
        	   newList.add(i);
           }
	    }
        //遍历新集合
        for (Integer integer : newList) {
			System.out.println(integer);
		}
  }
}