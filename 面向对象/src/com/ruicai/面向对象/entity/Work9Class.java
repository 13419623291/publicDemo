package com.ruicai.面向对象.entity;
/*定义一个网络用户类，要处理的信息有用户ID、用户密码、email地址。
 * 在建立类的实例时，把以上三个信息都作为构造函数的参数输入，
 * 其中用户ID和用户密码时必须的，
 * 缺省的email地址是用户ID加上字符串"@gameschool.com"
 */
public class Work9Class {
     private String id;
     private String password;
     private String email;
	public Work9Class(String id, String password, String email) {
		this.id = id;
		this.password = password;		
   	    if(email==" "){
		 this.email=id+"@gameschool.com";
	    }else{
		 this.email = email;
	    }
	}
	public void out(){
		System.out.println("ID:"+id+"\n密码:"+password+"\n邮箱："+email);
	}
//    public String toString(){
//    	return "ID:"+id+"\n密码:"+password+"\n邮箱："+email;
//    }
}
