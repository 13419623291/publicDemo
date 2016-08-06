<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="ueditor/ueditor.config.js"></script>  
<script type="text/javascript" src="ueditor/ueditor.all.js"></script>  
<link rel="stylesheet" href="ueditor/themes/default/css/ueditor.css">
<script type="text/javascript">
function test(){
	var xmlHttp;
// 	if(window.XMLHttpRequest){
// 		XMLHttp=new XMLHttpRequest();
// 	}else{
// 		XMLHttp=new ActiveXObject("Microsoft.XMLHTTP");
// 	}
	
	if(window.XMLHttpRequest){
		xmlHttp=new XMLHttpRequest();
	}else{
		xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
	}
	alert("readState状态："+xmlHttp.readyState+";status状态："+xmlHttp.status);
//  	alert(XMLHttp.getAllResponsetHeaders());
 	xmlHttp.onreadystatechange=function(){
		alert("readState状态："+xmlHttp.readyState+";status状态："+xmlHttp.status);
		if(xmlHttp.readyState==4 && xmlHttp.status==200){
			alert(xmlHttp.responseText);
			document.getElementById("name").value=xmlHttp.responseText;
		}
	};
}

// function loadName(){
// 	var xmlHttp;
// 	if(window.XMLHttpRequest){
// 		xmlHttp=new XMLHttpRequest();
// 	}else{
// 		xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
// 	}
// 	alert("readState状态："+xmlHttp.readyState+";status状态："+xmlHttp.status);
// 	xmlHttp.onreadystatechange=function(){
// 		alert("readState状态："+xmlHttp.readyState+";status状态："+xmlHttp.status);
// 		if(xmlHttp.readyState==4 && xmlHttp.status==200){
// 			alert(xmlHttp.responseText);
// 			document.getElementById("name").value=xmlHttp.responseText;
// 		}
// 	};
// 	// xmlHttp.open("get", "getAjaxName?name=jack&age=11", true);
// 	// xmlHttp.open("post", "getAjaxName?name=jack&age=11", true);
// 	// xmlHttp.send();
	
//     xmlHttp.open("post", "getAjaxName", true);
//     xmlHttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
//     xmlHttp.send("name=jack&age=11");
// }

</script>

</head>
<body>
<a href="scxz2.jsp">文件上传</a>
<a href="upload?action=list">文件下载</a>
<!-- <input type="button " value="AJAX测试" onclick="test()"> -->
<button onclick="test()">AJAX测试</button>
</body>
</html>