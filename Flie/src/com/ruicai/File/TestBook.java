package com.ruicai.File;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 1.创建一个书籍类，
 * 该类有int id;  String name;  String author;  float price属性，
 * 创建一个书籍对象并把它输出到一个文件book.dat中，
 * 然后再把该对象读出来，在屏幕上显示对象信息。
 * @author Administrator
 *
 */
class  Book{
	/*
	 * 1.创建一个书籍类，
     * 该类有int id;  String name;  String author;  float price属性，
	 */
	private int id;
	private String name;
	private String author;
	private float price;
	//定义带参构造方法
	public Book(int id, String name, String author, float price) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	//各属性的getxx、setxx方法
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
public class TestBook {

	public static void main(String[] args) throws IOException {
		// 创建Book对象传入参数
        Book book=new Book(3313,"资治通鉴","司马光",12f);
        //创建打印流对象，指定打印文件地址
        PrintStream ps=new PrintStream("book.txt");
        ps.printf("书籍ID：%d  \n书籍名字：%s \n书籍作者：%s \n书籍价格：%f",book.getId(),book.getName(),book.getAuthor(),book.getPrice());
        FileInputStream fis=new FileInputStream("book.txt");
        byte[]b=new byte[1024];
        int len;
        while((len=fis.read(b))>0){
        	System.out.println(new String(b,0,len));
        }
        
	}

}
