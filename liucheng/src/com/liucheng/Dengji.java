package com.liucheng;
import java.util.Scanner;
public class Dengji {
public static void main(String[] arge){
	Scanner sca=new Scanner(System.in);
	System.out.println("�㿼�˶��ٷ֣�");
	double grade=sca.nextDouble();
	if (grade>=90 && grade<=100){
		System.out.println("����");
	}else if(grade>=80){
		System.out.println("����");
	}else if(grade>=60){
		System.out.println("�е�");
	}else{
		System.out.println("�ϲ�");
	}
	
}
}
