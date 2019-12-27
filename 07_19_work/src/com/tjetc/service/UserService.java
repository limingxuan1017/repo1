package com.tjetc.service;

import java.util.List;

import com.tjetc.domain.User;

public interface UserService {

	//登录
	User login(String uname,String upwd);
	//注册
	boolean register(User user);
	//查询所有用户信息
	List<User> select();
}
