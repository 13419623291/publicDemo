package com.ruicai.面向对象.entity;
/**
 * （1）编写一个圆类Circle，该类拥有：
①一个成员变量
Radius（私有，浮点型）；  // 存放圆的半径；
       ②两个构造方法
          Circle( )                 // 将半径设为0
          Circle(double  r )         //创建Circle对象时将半径初始化为r
       ③ 三个成员方法
            double getArea( )       //获取圆的面积
            double getPerimeter( )   //获取圆的周长
            void  show( )          //将圆的半径、周长、面积输出到屏幕
（2）编写一个圆柱体类Cylinder，它继承于上面的Circle类。还拥有：
①一个成员变量
double hight（私有，浮点型）；  // 圆柱体的高；
       ②构造方法
          Cylinder (double r, double  h )           //创建Circle对象时将半径初始化为r
       ③ 成员方法
            double getVolume( )             //获取圆柱体的体积
            void  showVolume( )             //将圆柱体的体积输出到屏幕
编写应用程序，创建类的对象，分别设置圆的半径、圆柱体的高，计算并分别显示圆半径、圆面积、圆周长，圆柱体的体积。

 * @author Administrator
 *
 */
public class Circle {
     private  double radius;
     

	public Circle() {
	}


	public Circle(double radius) {
		this.radius = radius;
	}

    protected  double getArea(){
    	double area=Math.PI*(radius*radius);
    	return area;
    }
    private double getPerimeter(){
    	double perimeter=2*Math.PI*radius;
    	return perimeter;
    }
    public void show(){
    	System.out.println("圆的面积为："+getArea());
    	System.out.println("圆的周长为："+getPerimeter());
    }
}
