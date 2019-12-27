package com.tjetc.dao;

import java.util.List;

import com.tjetc.domain.User;

public interface UserDao {

	//根据用户名和密码查询用户
	User getUserByNamePwd(String uname,String upwd);
	//添加用户信息
	boolean addUser(User user);
	//根据用户名查询用户
	boolean getUserByName(String uname);
	//查询用户信息
	List<User> select();
}
