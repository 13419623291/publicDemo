package com.ruicai.jihe.entity;
/*3，在项目中创建一个User类自定义几个属性信息
 * ，在主方法中new出三个不同的User对象，
 * 创建集合对象存储刚刚新建的三个User对象。
 */
public class User {
  private String name;
  private String id;
  private int age;
  public User(String name, String id, int age) {
	super();
	this.name = name;
	this.id = id;
	this.age = age;
  }
public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
  public String getId() {
	return id;
 }
  public void setId(String id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
  
}
