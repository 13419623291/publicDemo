package com.liucheng;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		//从控制台接收数据 
        Scanner sca=new Scanner(System.in);
      //输入第一个数据
        System.out.println("请输入第一个数");
        double  num=sca.nextDouble();
      //输入第二个数据
        System.out.println("请输入第二个数");
        double  num1=sca.nextDouble();
        //判断比较大小并输出最大的数
        if (num-num1>0){
        	System.out.println(num);
        }else{
        	System.out.println(num1);
        }

	}

}
