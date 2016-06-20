package com.ruicai.面向对象.entity;
/**定义一个名为Vehicles（交通工具）的基类，
 * 该类中应包含String类型的成员属性brand（商标）和color（颜色），
 * 还应包含成员方法run（行驶，在控制台显示“我已经开动了”）和showInfo（显示信息，在控制台显示商标和颜色），
 * 并编写构造方法初始化其成员属性。
 */
public class Work8Vehicles {
     protected String brand;
     protected String color;
     
     public Work8Vehicles(String brand, String color) {
		this.brand = brand;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void run(){
    	 System.out.println("我已经开动了");
     }
     public void showInfo(){
    	 System.out.println("车的商标是："+brand+"\n车的颜色是："+color);
     }
}
