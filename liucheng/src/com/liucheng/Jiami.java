package com.liucheng;

import java.util.Scanner;

public class Jiami {

	public static void main(String[] args) {
		/**��дһ��Ӧ�ó�������������ַ������м��ܣ�������ĸ�ַ������ܹ������£�
          ��a������d�� ��b������e�� ��w������z�� ��x������a�� ��y������b�� ��z������c��
           ��A������B�� ��B������E�� ��W������Z�� ��X������A�� ��Y������B�� ��Z������C��
                                  ���������ַ��������м���		  
		 */
		Scanner sca=new Scanner(System.in);
		System.out.println("������һ���ַ�");
		String fu=sca.next();
		int num=(int)fu.charAt(0);
		switch (num){
		   case  97:
		   case  98:
		   case  66:
		   case  119:
		   case  87:
		    num=num+3;
		    char fu2=(char)num;
		    System.out.println(fu2);
		    break;
		   case  88:
		   case  89:
		   case  90:
		   case  120:			
		   case  121:
		   case  122:
		    num=num-23;
		    char fu3=(char)num;
			System.out.println(fu3);
			break;
		   case  65:
			num=num+1;
		    char fu4=(char)num;
			System.out.println(fu4);
			break;
		   default:
			System.out.println(fu);
		}
	}

}
