package com.liucheng;

import java.util.Scanner;

public class Sanjiao {

	public static void main(String[] args) {
		//��ȡ��������
		Scanner sca=new Scanner(System.in);
	//�������������߳�
		System.out.println("�������һ�߳�");
		double a=sca.nextDouble();
		System.out.println("������ڶ��߳�");
		double b=sca.nextDouble();
		System.out.println("������б�߳�");
		double c=sca.nextDouble();
		//�������������ߺʹ��ڵ����ߣ����߲�С�ڵ��������ж����������ܷ񹹳�������
		if (a+b>c&&a-b<c|b-a<c){
			if (a==b&&b!=c){
				System.out.println("����һ������������");
			}else if(a==b&&b==c){
			System.out.println("����һ���ȱ�������");
			}else{
				System.out.println("����һ��������");
			}
		}else {
			System.out.println("�ⲻ��һ��������");
		}
		}
	}
		
		




