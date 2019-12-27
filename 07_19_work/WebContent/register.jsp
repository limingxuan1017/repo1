<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>

<link rel="stylesheet" href="css/register.css" type="text/css" />
<script type="text/javascript" src="js/jquery-1.11.3.js" ></script>
<script type="text/javascript" src="js/register.js"></script>

</head>
<body>
<form action="RegisterServlet" method="post">
			<table>
				<caption id="title">注册用户信息</caption>
				<tr>
					<td>
						用户名：
					</td>
					<td>
						<input type="text" name="uname" placeholder="请填写用户名" id="uname" />
					</td>
					<td>
						<span id="name1"></span>
					</td>
				</tr>
				<tr>
					<td>
						密 码：
					</td>
					<td>
						<input type="password" name="upwd" placeholder="请填写密码" id="upwd"/>
					</td>
					<td>
						<span id="name2"></span>
					</td>
				</tr>
				<tr>
					<td>
						确认密码：
					</td>
					<td>
						<input type="password" name="upwd2" placeholder="请再次填写密码" id="upwd2"/>
					</td>
					<td>
						<span id="name3"></span>
					</td>
				</tr>
				<tr>
					<td>
						QQ：
					</td>
					<td>
						<input type="text" name="qq" placeholder="请填写QQ" id="qq"/>
					</td>
					<td>
						<span id="name4"></span>
					</td>
				</tr>
				<tr>
					<td>
						性 别：
					</td>
					<td colspan="2">
						<input type="radio" name="sex" value="男" id="man"/>男
						<input type="radio" name="sex" checked="checked" value="女" id="woman"/>女
					</td>
				</tr>
				<tr>
					<td>
						电子邮箱：
					</td>
					<td>
						<input type="email" name="email" placeholder="请填写邮箱" id="email" />
					</td>
					<td>
						<span id="name5"></span>
					</td>
				</tr>
				<tr>
					<td>
						年 龄：
					</td>
					<td>
						<select id="year" name="year">
							<option value="1996" selected="selected">1996年</option>
							<option value="1997">1997年</option>
							<option value="1998">1998年</option>
							<option value="1999">1998年</option>
							<option value="2000">2000年</option>
							<option value="2001">2001年</option>
							<option value="2002">2002年</option>
						</select>
						<select id="month" name="mon">
							<option value="1" selected="selected">1月</option>
							<option value="2">2月</option>
							<option value="3">3月</option>
							<option value="4">4月</option>
							<option value="5">5月</option>
							<option value="6">6月</option>
							<option value="7">7月</option>
							<option value="8">8月</option>
							<option value="9">9月</option>
							<option value="10">10月</option>
							<option value="11">11月</option>
							<option value="12">12月</option>
						</select>
						<select id="day" name="day">
							<option value="1" selected="selected">1日</option>
							<option value="2">2日</option>
							<option value="3">3日</option>
							<option value="4">4日</option>
							<option value="5">5日</option>
							<option value="6">6日</option>
							<option value="7">7日</option>
							<option value="8">8日</option>
							<option value="9">9日</option>
							<option value="10">10日</option>
							<option value="11">11日</option>
							<option value="12">12日</option>
							<option value="13">13日</option>
							<option value="14">14日</option>
							<option value="15">15日</option>
							<option value="16">16日</option>
							<option value="17">17日</option>
							<option value="18">18日</option>
							<option value="19">19日</option>
							<option value="20">20日</option>
							<option value="21">21日</option>
							<option value="22">22日</option>
							<option value="23">23日</option>
							<option value="24">24日</option>
							<option value="25">5日</option>
							<option value="26">26日</option>
							<option value="27">27日</option>
							<option value="28">28日</option>
							<option value="29">29日</option>
							<option value="30">30日</option>
							<option value="31">31日</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>
						兴 趣：
					</td>
					<td colspan="2">
						<input type="checkbox" name="hobby" value="Java" id="java"/>Java
						<input type="checkbox" name="hobby" value="HTML" id="html"/>HTML
						<input type="checkbox" name="hobby" value="UI" id="ui"/>UI
						<input type="checkbox" name="hobby" value="PHP" id="php"/>PHP
					</td>
				</tr>
				<tr>
					<td>
						地区：
					</td>
					<td colspan="2">
						<select id="loc" name="loc">
							<optgroup label="山东">
								<option value="临沂">临沂</option>
								<option value="日照">日照</option>
								<option value="菏泽">菏泽</option>
								<option value="济南">济南</option>
								<option value="青岛">青岛</option>
							</optgroup>
							<optgroup label="浙江">
								<option value="杭州">杭州</option>
								<option value="温州">温州</option>
								<option value="湖州">湖州</option>
								<option value="宁波">宁波</option>
								<option value="嘉兴">嘉兴</option>
							</optgroup>
							<optgroup label="江苏">
								<option value="南京">南京</option>
								<option value="徐州">徐州</option>
								<option value="苏州">苏州</option>
								<option value="无锡">无锡</option>
								<option value="南通">南通</option>
							</optgroup>
						</select>
					</td>
				</tr>
				<tr>
					<td colspan="3">
						<input type="submit" value="注册" id="register" />
						<input type="reset" value="重置" id="reset" />
					</td>
				</tr>
			</table>
		</form>
</body>
</html>