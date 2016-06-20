package com.ruicai.面向对象.test;

import java.util.Scanner;

import com.ruicai.面向对象.entity.Vehicle;

public class Work2Vehicle {
    /**请定义一个交通工具(Vehicle)的类，
     * 其中有:属性：速度(speed)，体积(size)等
     * 方法：移动(move())，设置速度(setSpeed(int speed))，加速speedUp(),减速speedDown()等等
     * 最后在测试类Vehicle中的main()中实例化一个交通工具对象，
     * 并通过方法给它初始化speed,size的值，并且通过打印出来。
     * 另外，调用加速，减速的方法对速度进行改变。
     */
	public static void main(String[] args) {
		//通过构造方法创建对象同时为其赋值
		Vehicle v=new Vehicle();
		v.setSpeed(40);
		v.setSize(100);
		System.out.println("现在的速度为："+v.getSpeed()+"\n车的大小为："+v.getSize());
		while(true){
	    	System.out.println("请输入您的选择：\n1.加速 2.减速");
	    	//接受键盘输入数据
	    	Scanner sca=new Scanner(System.in);
	    	int num=sca.nextInt();
	    	switch (num) {
			case 1:
				//调用加速方法
				v.speedUp();
				break;
			case 2:
				//调用减速方法
				v.speedDown();	
				break;
			}
	    }
	}

}
