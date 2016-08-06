<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="ueditor.config.js"></script>  
<script type="text/javascript" src="ueditor.all.js"></script>  
<link rel="stylesheet" href="themes/default/css/ueditor.css">


</head>
<body>
<div id="myEditor"></div>  
    <script language="javascript" type="text/javascript">  
        var option = {  
            initialContent : '',//初始化编辑器的内容  
            minFrameHeight : 800,//设置高度  
            textarea : 'content'//设置提交时编辑器内容的名字，之前我们用的名字是默认的editorValue  
        };  
        var editor = new baidu.editor.ui.Editor(option);  
        editor.render("myEditor");  
    </script> 
</body>
</html>