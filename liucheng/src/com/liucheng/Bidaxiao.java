package com.liucheng;
import java.util.Scanner;
import java.util.Arrays;
public class Bidaxiao {

	public static void main(String[] args) {
		//����һ���������
        int [] num=new int[4];
        //���մӿ���̨��������
        Scanner sca=new Scanner(System.in);
        //�����һ������
        System.out.println("�������һ������");
        num[0]=sca.nextInt();
        System.out.println("������ڶ�������");
        //����ڶ�������
        num[1]=sca.nextInt();
        System.out.println("���������������");
        //�������������
        num[2]=sca.nextInt();
        System.out.println("��������ĸ�����");
        //������ĸ�����
        num[3]=sca.nextInt();
        int max=num[0];
        int min=num[0];
        for (int i=0;i<num.length;i++){
        	if (num[i]>max){
        		max=num[i];        		
        	}
        	if (num[i]<min){
        		min=num[i];
        	}
        }
        System.out.println("�������"+max);
        System.out.println("��С����"+min);
        
	}

}
