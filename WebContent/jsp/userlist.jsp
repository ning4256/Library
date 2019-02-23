<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生列表页面</title>
</head>
<h1>This list page</h1>
<body>
	<table>
		<c:forEach items="${sessionScope.users}" var="user">
			<tr>
				<td>${user.user_id }</td>
				<td>${user.user_name }</td>
			</tr>
		
		</c:forEach>
	</table>
</body>
</html>