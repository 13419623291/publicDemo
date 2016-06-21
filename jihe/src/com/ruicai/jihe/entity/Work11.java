package com.ruicai.jihe.entity;

public class Work11 {
	   /*1，在项目中创建类,
	    * 在主方法中实例化集合对象，
	    * 并向集合中添加元素，
	    * 最后将集合中的对象以String形式输出。
	    */
	private  String name;
	private  int    age;
	
	public Work11() {
		super();
	}

	public Work11(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
