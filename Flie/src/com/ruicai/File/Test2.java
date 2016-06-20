package com.ruicai.File;

import java.io.File;
import java.io.FilenameFilter;

public class Test2 {

/*
 * 文件的过滤：找出指定后缀名的文件
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("f:\\");
		String [] arr=file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				//首先创建对象调用isFile方法判断对象是否是文件
//				利用文件名调用String中的endswith方法找出指定后缀名的文件名
				return new File(dir,name).isFile()&&name.endsWith(".txt");
			}
		});
		for (String string : arr) {
			System.out.println(string);
		}
	}

}
