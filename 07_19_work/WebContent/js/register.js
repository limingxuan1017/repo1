
$(function() {
	$("td:odd").css("width","100px");
	
	// 判断用户名
	$("#uname").blur(function() {
		// 先获取uname值
		var uname = $("#uname").val();
		var uname2 = /^[a-z0-9_-]{3,16}$/;// 长度在3-16位之间，由字母和数字组成
		// 判断
		if (uname == "") {
			// 提示
			$("#name1").html("用户名不能为空");
		} else if (uname2.test(uname)) {
			$("#name1").html("");
		} else {
			$("#name1").html("用户名输入不符合规范");
		}
	});
	
	// 判断密码
	$("#upwd").blur(function() {
		var upwd = $("#upwd").val();
		var upwd2 = /^[a-z0-9_-]{6,12}$/;// 长度在6-12位之间，由字母、数字和下划线组成
		// 判断
		if (upwd == "") {
			// 提示
			$("#name2").html("密码不能为空");
		} else if (upwd2.test(upwd)) {
			$("#name2").html("");
		} else {
			$("#name2").html("密码输入不符合规范");
		}
	});
	
	// 确认密码
	$("#upwd2").blur(function() {
		var upwd2 = $("#upwd2").val();
		var upwd = $("#upwd").val();
		// 判断
		if (upwd == "") {
			// 提示
			$("#name3").html("密码不能为空");
		} else if (upwd2 == upwd) {
			$("#name3").html("");
		} else {
			$("#name3").html("两次密码填写不一致");
		}
	});
	
	// QQ验证
	$("#qq").blur(function() {
		var qq = $("#qq").val();
		var qq2 = /^\d{6,10}$/;// 长度为6-10
		// 判断
		if (qq == "") {
			// 提示
			$("#name4").html("QQ不能为空");
		} else if (qq2.test(qq)) {
			$("#name4").html("");
		} else {
			$("#name4").html("QQ的长度必须是6-8位");
		}
	});
	
	// 邮箱验证
	$("#email").blur(function() {
		var uname = $("#uname").val();
		var email = $("#email").val();
		var email2 = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
		// 判断
		if (email == "") {
			// 提示
			$("#name5").html("邮箱不能为空");
		} else if (email2.test(email)) {
			$("#name5").html("");
		} else {
			$("#name5").html("邮箱不符合规范");
		}
	});
	
	//登录验证
	$("#register").click(function() {
		var name1 = $("#name1").val();
		var name2 = $("#name2").val();
		var name3 = $("#name3").val();
		var name4= $("#name4").val();
		var name5= $("#name5").val();
		// 判断
		if (name1 != ""||name2!=null||name3!=null||name4!=null||name5!=null) {
			alert("输入不完整！");
		}
	});
	
});
