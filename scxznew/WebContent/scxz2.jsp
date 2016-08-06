<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.chuan{
   height: 15px;
   width: 255px;
   background: #9ce0fd;
   border: 1px solid #FFFFFF;
   margin: 0;
   padding: 0;
   display:none;
   position: relative;
   left: 25px;
   float: left;
}

</style>

<script type="text/javascript">
function deal(){
	frm_test.submit();
	timer=window.setInterval("getProgress", 50);
}

var net=new Object();
//编写构造函数
net.AjaxRequest=function(url,onload,onerror,method,params){
	this.req=null;
	this.onerror=(onerror)?onerror:this.defaultError;
	this.onload=onload;
	this.loadDate(url,method,params);
}
net.AjaxRequest.prototype.loadDate=function(url,method,params){
	if(!method){
		method="get";
	}
	if(window.XMLHttpRequest){
		this.req=new XMLHttpRequest();
	}else{
		this.req=new ActiveXObject("Microsoft.XMLHTTP");
	}
	
	if(this.req){
		try{
			var load=this;
			this.req.onreadystatechange=function(){
				net.AjaxRequest.onReadyState.call(load);
			}
			this.req.open(method,url,true);
			if(method=="post"){
				this.req.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
			}
			this.req.send(params);
		}catch(e){
			this.onerror.call(this);
		}
	}
}

//重构回调函数
net.AjaxRequest.onReadyState=function(){
	var req=this.req;
	var ready=this.req.readyState;
	if(ready==4){
		if(req.status==200){
			this.onload.call(this);
		}else{
			this.onerror.call(this);
		}
	}
}

function getProgress(){
	var loader=new net.AjaxRequest("text.jsp?nocache="+new Date().getTime(),deal,onerror,"get");
}

function deal(){
	var h=this.req.responseText;
	h=h.replace(/\s/g,"");
	document.getElementById("span").style.display="";
	span.innerHTML=h+"%";
	document.getElementById("img").style.display="block";
	document.getElementById("images").width=h*(255/100);
}

function onerror(){
	alert("文件上传出错");
}
</script>
</head>
<body>
  	 <form name="frm_test" action="upload?action=shang" id="frm_test" method="post" enctype="multipart/form-data">
  	 	 用户名：<input type="text" name="userName">  <br/>
  	 	文件：   <input type="file" name="file_img">   <br/>
  	 	
  	 	<input type="submit" value="注册">
  	 </form>
  <div id="img" name="img" class="chuan" align="left"><img src="image/123.png" width="0" height="13" id="images"></div>	 
  	?<span id="span" style="width:40px display:none">0%</span> 
  	 
</body>
</html>