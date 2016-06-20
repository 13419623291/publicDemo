package com.ruicai.面向对象.entity;
/** 编写Car（小汽车）类继承于Vehicles类，增加int型成员属性seats（座位），
* 还应增加成员方法showCar（在控制台显示小汽车的信息），并编写构造方法。
*/
public class Work8Car extends Work8Vehicles {
	private int seats;
	
    public Work8Car(String brand, String color,int seats) {
    	super(brand,color);
    	this.seats=seats;
	}
    public int getSeats() {
	   return seats;
    }
    public void setSeats(int seats) {
	   this.seats = seats;
    }
      public void showCar(){
    	  System.out.println("商标："+brand+"\n颜色："+color+"\n座位："+seats+"座");
      }
     
    
   
   



  

}
