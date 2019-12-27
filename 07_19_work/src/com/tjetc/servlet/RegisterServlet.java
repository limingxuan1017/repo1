package com.tjetc.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tjetc.domain.User;
import com.tjetc.service.UserService;
import com.tjetc.service.impl.UserServiceImpl;

public class RegisterServlet extends HttpServlet {
       
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserService us = new UserServiceImpl();
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		response.setContentType("utf-8");
		
		boolean flag = us.register(new User(request.getParameter("uname"),request.getParameter("upwd"), 0));
		if(flag){
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else{
			response.getWriter().print("<script>" + "alert('用户已经存在,注册失败！');"+ "document.location.href='register.jsp';"+ "</script>");		
		}
	}

}
