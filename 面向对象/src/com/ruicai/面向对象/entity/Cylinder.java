package com.ruicai.面向对象.entity;
/**
 * （2）编写一个圆柱体类Cylinder，它继承于上面的Circle类。还拥有：
①一个成员变量
double hight（私有，浮点型）；  // 圆柱体的高；
       ②构造方法
          Cylinder (double r, double  h )           //创建Circle对象时将半径初始化为r
       ③ 成员方法
            double getVolume( )             //获取圆柱体的体积
            void  showVolume( )             //将圆柱体的体积输出到屏幕
 * @author Administrator
 *
 */
public class Cylinder extends Circle {
     private double hight;

	public Cylinder(double r,double hight) {
		super(r);
		this.hight = hight;
	}
	private double getVolume() {
		double volume=getArea()*hight;
		return volume;
	}
	public  void  showVolume(){
    	System.out.println("圆柱体的体积："+ getVolume());
    }
}
