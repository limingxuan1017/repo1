package com.tjetc.dao;

import java.util.List;

import com.tjetc.domain.User;

public interface UserDao {

	//�����û����������ѯ�û�
	User getUserByNamePwd(String uname,String upwd);
	//����û���Ϣ
	boolean addUser(User user);
	//�����û�����ѯ�û�
	boolean getUserByName(String uname);
	//��ѯ�û���Ϣ
	List<User> select();
}
