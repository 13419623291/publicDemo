package com.liucheng;
import java.util.Scanner;
public class Dengji {
public static void main(String[] arge){
	Scanner sca=new Scanner(System.in);
	System.out.println("你考了多少分？");
	double grade=sca.nextDouble();
	if (grade>=90 && grade<=100){
		System.out.println("优秀");
	}else if(grade>=80){
		System.out.println("良好");
	}else if(grade>=60){
		System.out.println("中等");
	}else{
		System.out.println("较差");
	}
	
}
}
