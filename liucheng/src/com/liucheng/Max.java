package com.liucheng;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		//�ӿ���̨�������� 
        Scanner sca=new Scanner(System.in);
      //�����һ������
        System.out.println("�������һ����");
        double  num=sca.nextDouble();
      //����ڶ�������
        System.out.println("������ڶ�����");
        double  num1=sca.nextDouble();
        //�жϱȽϴ�С�����������
        if (num-num1>0){
        	System.out.println(num);
        }else{
        	System.out.println(num1);
        }

	}

}
