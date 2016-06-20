package com.ruicai.面向对象.test;

import com.ruicai.面向对象.entity.Work8Car;
import com.ruicai.面向对象.entity.Work8Truck;
import com.ruicai.面向对象.entity.Work8Vehicles;

public class Work8 {
     /**定义一个名为Vehicles（交通工具）的基类，
      * 该类中应包含String类型的成员属性brand（商标）和color（颜色），
      * 还应包含成员方法run（行驶，在控制台显示“我已经开动了”）和showInfo（显示信息，在控制台显示商标和颜色），
      * 并编写构造方法初始化其成员属性。
      * 编写Car（小汽车）类继承于Vehicles类，增加int型成员属性seats（座位），
      * 还应增加成员方法showCar（在控制台显示小汽车的信息），并编写构造方法。
      * 编写Truck（卡车）类继承于Vehicles类，增加float型成员属性load（载重），
      * 还应增加成员方法showTruck（在控制台显示卡车的信息），并编写构造方法。
      * 在main方法中测试以上各类。
      */
	public static void main(String[] args) {
		Work8Vehicles vehicles=new Work8Vehicles("东风","蓝色");
		System.out.println("--------------------");
		vehicles.run();
		vehicles.showInfo();
		System.out.println("--------------------");
		Work8Car car=new Work8Car("东风雪铁龙","白色",5);
		car.showCar();
		System.out.println("--------------------");
		Work8Truck truck=new Work8Truck("东风风神","红色",7.5f);
		truck.showTruck();
	}

}
