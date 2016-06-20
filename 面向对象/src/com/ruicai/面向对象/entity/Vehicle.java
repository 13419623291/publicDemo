package com.ruicai.面向对象.entity;
/**请定义一个交通工具(Vehicle)的类，
 * 其中有:属性：速度(speed)，体积(size)等
 * 方法：移动(move())，设置速度(setSpeed(int speed))，加速speedUp(),减速speedDown()等等
 * 最后在测试类Vehicle中的main()中实例化一个交通工具对象，
 * 并通过方法给它初始化speed,size的值，并且通过打印出来。
 * 另外，调用加速，减速的方法对速度进行改变。
 */
public class Vehicle {
	//定义私有成员变量
   private int speed;
   private double size;
 //定义构造方法
   public Vehicle() {
}
   public void move() {
   }
public int getSpeed() {
	return speed;
}

public void setSpeed(int speed) {
	this.speed = speed;
}

public double getSize() {
	return size;
}

public void setSize(double size) {
	this.size = size;
}

//定义加速运算方法，限定最高时速180Km/h 超过不许加速并提醒其减速
   public void speedUp(){
	   int num=(int)(1+Math.random()*50);
	   int newSpeed=speed+num;
	   if(newSpeed<=180){
		   System.out.println("您当前速度为"+newSpeed+"Km/h,请谨慎行驶");
		   this.speed=newSpeed;
	   }else{
		   System.out.println("您已超速，请尽快减速");
	   }
	}
   //定义减速运算方法 限定10Km/h为最低速度 低于提醒其加速或停车
   public void speedDown(){
	   int num=(int)(1+Math.random()*50);
	   int newSpeed=speed-num;
	   if(newSpeed>=10){
		   System.out.println("您当前速度为"+newSpeed+"Km/h,请谨慎行驶");
		   this.speed=newSpeed;
	   }else{
		   System.out.println("您当前速度为："+newSpeed+"Km/h\n已接近最低速度，请选择加速或停车");
	   }
	}
}
