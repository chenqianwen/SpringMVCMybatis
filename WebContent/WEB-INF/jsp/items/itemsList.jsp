<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>商品名称</td>
			<td>商品价格</td>
			<td>生产日期</td>
			<td>商品描述</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${itemsList}" var="item">
			<tr>
				<td>${item.name}</td>
				<td>${item.price}</td>
				<td>${item.proDate}</td>
				<td>${item.detail}</td>
				<td>操作</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>