package com.ruicai.面向对象.entity;
/*编写Addition类，该类中应包含一组实现两数相加运算的重载方法。
实现加法运算的方法，应接受两个参数（即加数和被加数），方法将两个参数进行加法运算后，返回相加结果。
考虑可能针对不同的数据类型进行计算，重载一组方法，包括整型、长整型、浮点型、双精度浮点型、还有字符串。
在main方法中创建Addition类的实例，分别调用重载方法测试其效果。
应将Addition类打入到包中，以自己名字的拼音为包命名。 
 */
public class Work10Addition {
       private int num1;
       private int num2;
       private long num3;
       private long num4;
       private double num5;
       private double num6;
       private float num7;
       private float num8;
       private String num9;
       private String num10;
       public Work10Addition(){
    	   
       }
       public int add(int num1,int num2){
    	   int sum=num1+num2;
    	   return sum;
       }
       public long add(long num3,long num4){
    	   long sum=num3+num4;
    	   return sum;
       }
       public float add(float num7,float num8){
    	   float sum=num7+num8;
    	   return sum;
       }
       public double add(double num5,double num6){
    	   double sum=num5+num6;
    	   return sum;
       }
       public String add(String num9,String num10){
    	   String sum=num9+num10;
    	   return sum;
       }
}
