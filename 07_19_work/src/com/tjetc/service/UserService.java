package com.tjetc.service;

import java.util.List;

import com.tjetc.domain.User;

public interface UserService {

	//��¼
	User login(String uname,String upwd);
	//ע��
	boolean register(User user);
	//��ѯ�����û���Ϣ
	List<User> select();
}
