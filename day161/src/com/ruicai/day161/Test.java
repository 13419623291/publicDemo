package com.ruicai.day161;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		/*
		 * map 一种容器
		 * 
		 */
		/*遍历Map
		 * 1.Map转换为set形式 Set--->Set <Map.Entry<String,Integer>> set=map.entrySet();
		 * 2.调用set中的Iterator接口--->Iterator <Map.Entry<String,Integer>> it=set.iterator();
		 * 3.调用方法循环遍历--->while (it.hasNext()){
        	                 Map.Entry<String,Integer> ob=it.next();
        	                 System.out.println(ob);
                            }
           4.这里面嵌套了一个泛型
		 */
          //建立容器
		Map <String,Integer> map=new HashMap <String,Integer> ();
	    //保存数据
		//map.put(key, value)
		map.put("雷波", 89);
		map.put("周蓉", 90);
		//查看map的数据个数
		System.out.println("map数据个数:"+map.size());
		//获取指定数据
		int num=map.get("周蓉");
		System.out.println(num);
		//获取集合元素
		Set <Map.Entry<String,Integer>> set=map.entrySet();
        Iterator <Map.Entry<String,Integer>> it=set.iterator();
        while (it.hasNext()){
        	Map.Entry<String,Integer> ob=it.next();
        	System.out.println(ob);
        }
	}

}
