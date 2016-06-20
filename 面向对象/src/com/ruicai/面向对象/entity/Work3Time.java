package com.ruicai.面向对象.entity;
/**
 * 在程序中，经常要对时间进行操作，但是并没有时间类型的数据。那么，我们可以自己实现一个时间类，来满足程序中的需要。
定义名为MyTime的类，其中应有三个整型成员：时（hour），分（minute），秒（second），
为了保证数据的安全性，这三个成员变量应声明为私有。
为MyTime类定义构造方法，以方便创建对象时初始化成员变量。
再定义diaplay方法，用于将时间信息打印出来。
为MyTime类添加以下方法：
addSecond(int sec)
addMinute(int min)
addHour(int hou)
subSecond(int sec)
subMinute(int min)
subHour(int hou)
分别对时、分、秒进行加减运算
 */
public class Work3Time {
	//定义私有成员变量
    private  int hour;
    private  int minute;
    private  int second;
  //定义带参的构造方法
    public Work3Time(int hour,int minute,int second){
    	this.hour=hour;
    	this.minute=minute;
    	this.second=second;
    }
    //定义秒相加方法
    public void addSecond(int sec){
    	int newSec=second+sec;
    	this.second=newSec;
    }
  //定义分相加方法
    public void addMinute(int min){
    	int newMin=minute+min;
    	this.minute=newMin;
    }
  //定义小时相加方法
    public void addHour(int hou){
    	int newHou=hour+hou;
    	this.hour=newHou;
    }
  //定义秒相减方法
    public void subSecond(int sec){
    	int newSec=second-sec;
    	this.second=sec;
    }
  //定义分相减方法
    public void subMinute(int min){
    	int newMin=minute-min;
    	this.minute=newMin;
    }
  //定义小时相减方法
    public void subHour(int hou){
    	int newHou=hour-hou;
    	this.hour=newHou;
    }
  //定义输出方法并输出现在的时分秒
    public void diaplay(){
    	System.out.println("当前时间为："+hour+"时"+minute+"分"+second+"秒");
    }
}
