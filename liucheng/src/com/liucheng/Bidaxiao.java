package com.liucheng;
import java.util.Scanner;
import java.util.Arrays;
public class Bidaxiao {

	public static void main(String[] args) {
		//定义一个整型组合
        int [] num=new int[4];
        //接收从控制台输入数据
        Scanner sca=new Scanner(System.in);
        //输入第一个整数
        System.out.println("请输入第一个整数");
        num[0]=sca.nextInt();
        System.out.println("请输入第二个整数");
        //输入第二个整数
        num[1]=sca.nextInt();
        System.out.println("请输入第三个整数");
        //输入第三个整数
        num[2]=sca.nextInt();
        System.out.println("请输入第四个整数");
        //输入第四个整数
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
        System.out.println("最大数："+max);
        System.out.println("最小数："+min);
        
	}

}
