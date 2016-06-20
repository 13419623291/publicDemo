package com.liucheng;

public class Zhishu {

	public static void main(String[] args) {
		//质数：一个大于1的自然数，除了1和它本身外，不能被其他自然数整除		
		// 定义i和j是整型
		int i,j;
		//由于1不是质数所以从二开始循环计算
		for(i=2;i<=100;i++){
			/*由于任何数除以1都为它本身 所以1没有判断意义，从二开始到该数字依次循环求模
			*当所有数字循环完后模都不为零则其为质数 反之不是
		    */for(j=2;j<=i;j++){
		         if(i%j==0)
		           break;

		   }if (j>=i){
		    System.out.print(i+" ");
		   }
		}
	}
  }
	