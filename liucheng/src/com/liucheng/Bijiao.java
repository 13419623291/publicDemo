package com.liucheng;

import java.util.Scanner;

public class Bijiao {

	public static void main(String[] args) {
		int i=0;
		//���տ���̨��������
       Scanner sca=new Scanner(System.in);
       System.out.println("�������һ������");//��ʾ��
       int  n1=sca.nextInt();//�����һ����
       System.out.println("������ڶ�������");//��ʾ��
       int  n2=sca.nextInt();//����ڶ�����
       System.out.println("���������ǵĺ�");//��ʾ��
       int  sum=sca.nextInt();//����Ͳ��ж� 
       if (sum==n1+n2){
    	   i++;
       }
       System.out.println("���������ǵĻ�");//��ʾ��
       int  ji=sca.nextInt();//��������ж� 
       if (ji==n1*n2){
    	   i++;
       }
       System.out.println("���������ǵ���");//��ʾ��
       int  shang=sca.nextInt();//�����̲��ж� 
       if (shang==n1/n2|shang==n2/n1){
    	   i++;
       }    
       System.out.println("���������ǵĲ�");//��ʾ��
       int  cha=sca.nextInt();//�����ж� 
       if (cha==n1-n2|cha==n2-n1){
    	   i++;
           } 
       System.out.println("���������ǵ�����");//��ʾ��
       int  mo=sca.nextInt();//�����������ж� 
       if (mo==n1%n2|mo==n2%n1){
    	   i++;
          }
       
             System.out.println("������"+i+"��");   	
       } 	
}
