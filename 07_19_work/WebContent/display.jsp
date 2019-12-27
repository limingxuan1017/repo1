<%@page import="com.tjetc.domain.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息的展示</title>
<link rel="stylesheet" href="css/display.css" type="text/css" />
</head>
<body>
<% List<User> users=(List<User>)request.getAttribute("users");%>

	<table>
		<tr class="tr1">
			<td>编号</td>
			<td>姓名</td>
			<td>密码</td>
			<td>身份</td>
		</tr>
		<% for(User user:users){ %>
		<tr>
		<td><%=user.getUid() %></td>
		<td><%=user.getUname() %></td>
		<td><%=user.getUpwd() %></td>
		<td><%=user.getIsadmin() %></td>
		</tr>
		<%} %>
	</table> 
</body>
</html>