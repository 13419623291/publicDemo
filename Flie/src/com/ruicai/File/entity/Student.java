package com.ruicai.File.entity;

import java.io.Serializable;
//implements Serializable
public class Student implements Serializable{
    String name;
    String id;
	public Student(String name, String id) {
		super();
		this.name = name;
		this.id = id;
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
    /**
     * 重写toString：打印对象的信息
     */
	public String toString(){
		return "学生姓名"+name+"学生ID"+id;
	}
}
