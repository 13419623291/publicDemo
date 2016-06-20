package com.liucheng;
import  java.util.Scanner;
public class Zhengshu {
public static void main(String[] arge){
	//从控制台接收数据
	Scanner sca=new Scanner(System.in);
	//输入一个正整数
	System.out.println("请输入一个正整数");
	int shu=sca.nextInt();
	//循环求模
	while (shu>=1){
		int num=shu%10;
		System.out.print(num);
		shu=shu/10;
	}
	
	
		
	}
	
}

