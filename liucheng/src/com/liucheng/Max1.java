package com.liucheng;
import java.util.Arrays;
import java.util.Scanner;
public class Max1 {
 public static void main(String[] agre){
	 //从控制台接收数据
	 Scanner sca=new Scanner(System.in);
	 //输入第一个数据
	 System.out.println("请输入第一个数");
	 double  num=sca.nextDouble();
	//输入第二个数据
	 System.out.println("请输入第二个数");
	 double  num1=sca.nextDouble();
	//输入第三个数据
	 System.out.println("请输入第三个数");
	 double  num2=sca.nextDouble();
	 //第一种方法
//	 double  max=num1;//定义num1是最大的一个数
	 //比较各数大小并输出最大值和从大到小的顺序
//    // if (num>num1){
//    	 max=num;
//    	 if(max>num2){
//    		 System.out.println("最大的数为"+max);
//    		 if (num1>num2){
//    		 System.out.println("顺序为"+num+num1+num2);
//    		 }else{
//    			 System.out.println("顺序为"+num+ num2+ num1); 
//    		 }
//    	 }else{
//    		 System.out.println("最大的数为"+num2);
//    		 System.out.println("顺序为"+num2+ num+ num1);
//    	 }
//     }else if(max>num2){
//    	 System.out.println("最大的数为"+max);
//    	 if (num>num2){
//    	 System.out.println("顺序为"+num1+ num+ num2);
//    	 }else{
//    		 System.out.println("顺序为"+num1+ num2+ num);
//    	 }
//     }else{
//    	 System.out.println("最大的数为"+num2);
//    	 System.out.println("顺序为"+num2+ num1+ num);
//    	 }
	 //第二种方法
	 //定义一个double类型数组
	 double [] shu=new double[3];
	 //给数组赋值
	   shu[0]=num;
	   shu[1]=num1;
	   shu[2]=num2;
	   //定义shu[0]位最大值
	   double max=shu[0];
	   //运用Arrays类中的sort方法对数组排序
	   Arrays.sort(shu);
	   for (int i=shu.length-1;i>=0;i--){
		   //判断比较出最大值
		   if (shu[i]>max){
			   max=shu[i];
			   System.out.println("最大数为"+max);			   
		   }
		   System.out.println("顺序为"+shu[i]);
	   }
     
 }
}
