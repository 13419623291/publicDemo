package com.ruicai.面向对象.test;

import com.ruicai.面向对象.entity.Circle;
import com.ruicai.面向对象.entity.Cylinder;

public class CylinderCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle(10.0);
		Cylinder c1=new Cylinder(5.0,10.0);
		c.show();
		c1.showVolume();
	}

}
