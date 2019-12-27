 package com.tjetc.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tjetc.domain.User;
import com.tjetc.service.UserService;
import com.tjetc.service.impl.UserServiceImpl;

public class LoginServlet extends HttpServlet{
    
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//����һ������
		UserService us = new UserServiceImpl();
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		response.setContentType("utf-8");
		//��ñ��ύ������
		String uname=request.getParameter("uname");
		String upwd=request.getParameter("upwd");
		//����login����
		User user = us.login(uname, upwd);
		//�ж�
		if(user!=null){//�����Ϊ�գ���������û�����ת����ҳ
			//ʹ������ת���ķ�ʽ
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else{
			//û������û�������ʾ��¼���ɹ�
			response.getWriter().print("<script>" + "alert('�û�������,�����µ�¼��');"+ "document.location.href='login.jsp';"+ "</script>");		
		}	
	}

}
