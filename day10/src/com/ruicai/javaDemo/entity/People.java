package com.ruicai.javaDemo.entity;

public class People {
	
	public  int id;//身份证号
	public  int age;//年龄
	public  String userName;
	public  String address;
	public  String handSome;
	public  String hand;//手
	public  String mouth;//嘴巴
   
   public People(){
	   
   }
   
   public People(String userName,String address,String mouth){
	  // this.类的属性====》方法的参数 
	   this.address=address;
	   
   }
   
   
   public People(int id, int age, String userName, String address, String handSome, String hand, String mouth) {
	super();
	this.id = id;
	this.age = age;
	this.userName = userName;
	this.address = address;
	this.handSome = handSome;
	this.hand = hand;
	this.mouth = mouth;
}

/**
    *  方法定义：
    *  如果没有返回值： 在方法前面加void
    *  如果 有返回值，在方法名前面加上返回的数据的类型
    *  方法结尾以return结尾，后面加上数据
    *  
    */
   //行为
   /**
    * 打人事件
    */
   public boolean  fight(){
	   
	   return true;
   }
   
   
   /**
    * 吃
    * 参数： String mouth:一个工具，没有这个工具就不能完成吃的动作
    *      
    */
   public  String  eat(String mouth){
	   
	   return mouth;
   }
   
   /**
    * 拉
    * void:没有返回值
    */
   public   void  out(){
	   
	   System.out.println("拉完了，好舒服");
	   
   }
   
   /**
    * 获取人的年龄
    */
   public void getUserAge(){
	//   getUserType();//获取人的类型
	   System.out.println("我可以获取人的年龄");
   }
   /**
    *  判断这个人是什么类型的人：老年，中年，少年
    */
   public void  getUserType(){
//	   People  liFaQiang =new People();
//	   liFaQiang.getUserAge();
	   this.getUserAge();//代指当前调用该方法的对象
	   System.out.println("我可以获取人的类型");
   }
   /**
    *  测试成绩的
    */
   public  void  testGrade(String userName){
		
		System.out.println("我的成绩很牛逼"+userName);
	}
	
}
