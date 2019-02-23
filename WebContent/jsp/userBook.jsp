<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>用户图书页面</title>
</head>
<body>
	<table>
		<c:forEach items="${sessionScope.UserBook}" var="book">
			<tr>
				<td>${book.book_id }</td>
				<td>${book.book_name }</td>
				<td>${book.book_des }</td>
				<td>${book.book_price }</td>
				<td>${book.book_publish }</td>
				<td>${book.book_date }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>