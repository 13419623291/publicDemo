package com.ruicai.jihe.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

import javax.management.loading.PrivateClassLoader;

public class Porker {
      /**
       * 1.制作牌
       * 2.洗牌
       * 3.发牌
       * 4.看牌
       * @param args
       */
	public static void main(String[] args) {
		// 创建map集合存储牌
     HashMap<Integer, String> hm=new HashMap<Integer, String>();
        //创建list集合存储牌的编号
     List <Integer>list=new ArrayList<Integer>();
        //创建花色数组
     String[]hua={"♥","♣","♠","♦"};
     String[]num={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
     int num1=0;
     for (String str : num) {
		for (String st : hua) {
			String s=st.concat(str);
			hm.put(num1, s);
			list.add(num1);
			num1++;
		}
	}
     hm.put(num1, "大王");
	 list.add(num1);
	 num1++;
	 hm.put(num1, "小王");
	 list.add(num1);
     //洗牌
     Collections.shuffle(list);
     //发牌
     //定义TreeSet集合来接受发的牌   因为TreeSet集合是自己按自然数排序的
     TreeSet<Integer>ts=new TreeSet<Integer>();
     TreeSet<Integer>ts1=new TreeSet<Integer>();
     TreeSet<Integer>ts2=new TreeSet<Integer>();
     TreeSet<Integer>ts3=new TreeSet<Integer>();
     //遍历发牌
     for (int i = 0; i < list.size(); i++) {
		if(i>=list.size()-3){
			ts3.add(list.get(i));
		}else if(i%3==0){
			ts.add(list.get(i));
		}else if(i%3==1){
			ts1.add(list.get(i));
		}else if(i%3==2){
			ts2.add(list.get(i));
		}		
			
	}
        kan("玩家一",ts,hm);
		kan("玩家二",ts1,hm);
		kan("玩家三",ts2,hm);
		kan("底牌",ts3,hm);
     
     
	}
	 //看牌  定义一个方法分别去传入玩家
    private  static void kan(String name,TreeSet<Integer>t,HashMap<Integer, String> h){
   	  System.out.println(name+"的牌是：");
   	  for (Integer integer : t) {
			String v=h.get(integer);
			System.out.print(v+" ");
		}
   	  System.out.println();
     } 	

}
