package com.ruicai.jihe.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Work6 {
/*分别向Set集合以及List集合中添加“A”，“a”，“c”,”C ””a”,
 * 观察重复值“a”能否在List集合以及Set集合中成功地添加。
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Set <String> set=new HashSet<String>();
       List <String> list=new ArrayList<String>(); 
       set.add("A");
       set.add("a");
       set.add("c");
       set.add("C");
       set.add("a");
       Iterator<String> it=set.iterator();
      while (it.hasNext()){
    	  System.out.println(it.next());
      }
      System.out.println("------------");
      list.add("A");
      list.add("a");
      list.add("c");
      list.add("C");
      list.add("a");
      Iterator<String> it1= list.iterator();
     while (it1.hasNext()){
   	  System.out.println(it1.next());
     }
	}

}
