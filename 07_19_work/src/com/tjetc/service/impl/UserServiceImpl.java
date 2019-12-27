package com.tjetc.service.impl;

import java.util.List;

import com.tjetc.dao.impl.UserDaoImpl;
import com.tjetc.domain.User;
import com.tjetc.service.UserService;

public class UserServiceImpl implements UserService{
	
	private UserDaoImpl uerDao=new UserDaoImpl();
	
	@Override
	public User login(String uname, String upwd) {
		// TODO Auto-generated method stub
		User user = uerDao.getUserByNamePwd(uname, upwd);
		return user;
	}

	@Override
	public boolean register(User user) {
		// TODO Auto-generated method stub
		boolean flag = uerDao.getUserByName(user.getUname());
		if(flag){
			return false;
		}else{
			uerDao.addUser(user);
			return true;
		}
	}

	@Override
	public List<User> select() {
		// TODO Auto-generated method stub	
		return uerDao.select();
	}

}
