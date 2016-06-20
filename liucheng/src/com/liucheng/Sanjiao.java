package com.liucheng;

import java.util.Scanner;

public class Sanjiao {

	public static void main(String[] args) {
		//获取输入数据
		Scanner sca=new Scanner(System.in);
	//输入三角形三边长
		System.out.println("请输入第一边长");
		double a=sca.nextDouble();
		System.out.println("请输入第二边长");
		double b=sca.nextDouble();
		System.out.println("请输入斜边长");
		double c=sca.nextDouble();
		//根据三角形两边和大于第三边，两边差小于第三边来判断输入数据能否构成三角形
		if (a+b>c&&a-b<c|b-a<c){
			if (a==b&&b!=c){
				System.out.println("这是一个等腰三角形");
			}else if(a==b&&b==c){
			System.out.println("这是一个等边三角形");
			}else{
				System.out.println("这是一个三角形");
			}
		}else {
			System.out.println("这不是一个三角形");
		}
		}
	}
		
		




