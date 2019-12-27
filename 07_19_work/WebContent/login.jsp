<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
<link rel="stylesheet" href="css/login.css" type="text/css" />
</head>
<body>
<form action="LoginServlet" method="post">
			<table>
				<caption id="title">登录页面</caption>
				<tr>
					<td>
						用户名：
					</td>
					<td>
						<input type="text" name="uname" placeholder="请填写用户名" />
					</td>
				</tr>
				<tr>
					<td>
						密 码：
					</td>
					<td>
						<input type="password" name="upwd" placeholder="请填写密码" />
					</td>
				</tr>
				
				<tr>
					<td colspan="2">
						<input type="submit" value="登录" id="register" />
						<input type="reset" value="取消" id="reset" />
					</td>
				</tr>
			</table>
		</form>
		
		<%if(request.getAttribute("msg")!=null){ %>
		<span id="span1">
		  <%=request.getAttribute("msg") %>
		</span>
		<%} %>
</body>
</html>