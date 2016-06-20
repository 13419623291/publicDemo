package com.ruicai.day161;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {
		// 创建两个Map集合
        Map <String,Integer> map=new HashMap <String,Integer>();
        Map <String,Integer> map1=new HashMap <String,Integer>();
        //分别向两个集合中添加元素
        map.put("语文", 100);
        map.put("英语", 90);
        map.put("数学", 80);
        map.put("政治", 60);
        map1.put("java", 20);
        map1.put("Android", 80);
        map1.put("PHP", 25);
        Iterator<Map.Entry<String,Integer>>  mapSet=map.entrySet().iterator();
        while(mapSet.hasNext()){
         Map.Entry<String,Integer> set=mapSet.next();
         System.out.println(set);
        }
        map.putAll(map1);
        Iterator<Map.Entry<String,Integer>>  it=map.entrySet().iterator();
        while(it.hasNext()){
         Map.Entry<String,Integer> set=it.next();
         System.out.println("添加新元素后的集合："+set);
        }
	}

}
