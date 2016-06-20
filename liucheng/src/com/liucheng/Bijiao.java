package com.liucheng;

import java.util.Scanner;

public class Bijiao {

	public static void main(String[] args) {
		int i=0;
		//接收控制台输入数据
       Scanner sca=new Scanner(System.in);
       System.out.println("请输入第一个整数");//提示语
       int  n1=sca.nextInt();//输入第一个数
       System.out.println("请输入第二个整数");//提示语
       int  n2=sca.nextInt();//输入第二个数
       System.out.println("请输入它们的和");//提示语
       int  sum=sca.nextInt();//输入和并判断 
       if (sum==n1+n2){
    	   i++;
       }
       System.out.println("请输入它们的积");//提示语
       int  ji=sca.nextInt();//输入积并判断 
       if (ji==n1*n2){
    	   i++;
       }
       System.out.println("请输入它们的商");//提示语
       int  shang=sca.nextInt();//输入商并判断 
       if (shang==n1/n2|shang==n2/n1){
    	   i++;
       }    
       System.out.println("请输入它们的差");//提示语
       int  cha=sca.nextInt();//输入差并判断 
       if (cha==n1-n2|cha==n2-n1){
    	   i++;
           } 
       System.out.println("请输入它们的余数");//提示语
       int  mo=sca.nextInt();//输入余数并判断 
       if (mo==n1%n2|mo==n2%n1){
    	   i++;
          }
       
             System.out.println("你答对了"+i+"个");   	
       } 	
}
