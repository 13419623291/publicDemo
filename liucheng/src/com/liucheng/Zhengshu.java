package com.liucheng;
import  java.util.Scanner;
public class Zhengshu {
public static void main(String[] arge){
	//�ӿ���̨��������
	Scanner sca=new Scanner(System.in);
	//����һ��������
	System.out.println("������һ��������");
	int shu=sca.nextInt();
	//ѭ����ģ
	while (shu>=1){
		int num=shu%10;
		System.out.print(num);
		shu=shu/10;
	}
	
	
		
	}
	
}

