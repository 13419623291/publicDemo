<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table  border="1" align="center" cellspacing="0"> 
       <tr>
			<th>序号</th>
			<th>文件名</th>
			<th>操作</th>
		</tr>
	<c:forEach  items="${ fileNames}" var="es" varStatus="file">
	 <tr>
				<td>${file.count }</td>
				<td>${es.value }</td>
				<td>
				<c:url var="url" value="upload">
						<c:param name="action" value="down"></c:param>
						<c:param name="fileName" value="${es.key}"></c:param>
					</c:url>
					<a href="${url }">下载</a>
				</td>
			</tr>	
	</c:forEach>

</table>





</body>
</html>