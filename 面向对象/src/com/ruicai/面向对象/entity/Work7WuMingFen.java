package com.ruicai.面向对象.entity;
/*为“无名的粉”写一个类：class WuMingFen 要求：
1.有三个属性：面码:String theMa  粉的分量(两)：int quantity 
	      是否带汤：boolean likeSoup
2.写一个构造方法，以便于简化初始化过程，如：
	WuMingFen f1 = new WuMingFen("牛肉",3,true);
3.重载构造方法，使得初始化过程可以多样化：
	WuMingFen f2 = new WuMingFen("牛肉",2);
4.如何使得下列语句构造出来的粉对象是酸辣面码、2两、带汤的？
	WuMingFen f3 = new WuMingFen();
5.写一个普通方法：check()，用于查看粉是否符合要求。即：将对象的三个属性打印在控制台上
 */
public class Work7WuMingFen {
	private String theMa;
	private int quantity;
	private boolean likeSoup;
	public Work7WuMingFen(String theMa, int quantity, boolean likeSoup) {
		this.theMa = theMa;
		this.quantity = quantity;
		this.likeSoup = likeSoup;
	}
	public Work7WuMingFen(String theMa, int quantity) {
		this.theMa = theMa;
		this.quantity = quantity;
	}
	public Work7WuMingFen() {
	}
	
	public String getTheMa() {
		return theMa;
	}
	public void setTheMa(String theMa) {
		this.theMa = theMa;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean gatLikeSoup() {
		return likeSoup;
	}
	public void setLikeSoup(boolean likeSoup) {
		this.likeSoup = likeSoup;
	}
	public void check(){
		System.out.println("面码:"+theMa+"\n分量:"+quantity+"两"+"\n是否带汤："+likeSoup);
	}
}
