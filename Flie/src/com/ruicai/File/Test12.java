package com.ruicai.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test12 {
     public static void main(String[] args) throws FileNotFoundException {
		Scanner sca=new Scanner(new File("zi1.txt"));
		while(sca.hasNext()){
		if(sca.hasNextDouble()){
			System.out.println(sca.nextDouble());
		}
		}
	}
}
