package com.liucheng;
import java.util.Arrays;
import java.util.Scanner;
public class Max1 {
 public static void main(String[] agre){
	 //�ӿ���̨��������
	 Scanner sca=new Scanner(System.in);
	 //�����һ������
	 System.out.println("�������һ����");
	 double  num=sca.nextDouble();
	//����ڶ�������
	 System.out.println("������ڶ�����");
	 double  num1=sca.nextDouble();
	//�������������
	 System.out.println("�������������");
	 double  num2=sca.nextDouble();
	 //��һ�ַ���
//	 double  max=num1;//����num1������һ����
	 //�Ƚϸ�����С��������ֵ�ʹӴ�С��˳��
//    // if (num>num1){
//    	 max=num;
//    	 if(max>num2){
//    		 System.out.println("������Ϊ"+max);
//    		 if (num1>num2){
//    		 System.out.println("˳��Ϊ"+num+num1+num2);
//    		 }else{
//    			 System.out.println("˳��Ϊ"+num+ num2+ num1); 
//    		 }
//    	 }else{
//    		 System.out.println("������Ϊ"+num2);
//    		 System.out.println("˳��Ϊ"+num2+ num+ num1);
//    	 }
//     }else if(max>num2){
//    	 System.out.println("������Ϊ"+max);
//    	 if (num>num2){
//    	 System.out.println("˳��Ϊ"+num1+ num+ num2);
//    	 }else{
//    		 System.out.println("˳��Ϊ"+num1+ num2+ num);
//    	 }
//     }else{
//    	 System.out.println("������Ϊ"+num2);
//    	 System.out.println("˳��Ϊ"+num2+ num1+ num);
//    	 }
	 //�ڶ��ַ���
	 //����һ��double��������
	 double [] shu=new double[3];
	 //�����鸳ֵ
	   shu[0]=num;
	   shu[1]=num1;
	   shu[2]=num2;
	   //����shu[0]λ���ֵ
	   double max=shu[0];
	   //����Arrays���е�sort��������������
	   Arrays.sort(shu);
	   for (int i=shu.length-1;i>=0;i--){
		   //�жϱȽϳ����ֵ
		   if (shu[i]>max){
			   max=shu[i];
			   System.out.println("�����Ϊ"+max);			   
		   }
		   System.out.println("˳��Ϊ"+shu[i]);
	   }
     
 }
}
