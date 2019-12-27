package com.tjetc.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tjetc.dao.UserDao;
import com.tjetc.domain.User;
import com.tjetc.util.JDBC;

public class UserDaoImpl implements UserDao{


	@Override
	public User getUserByNamePwd(String uname, String upwd) {
		// TODO Auto-generated method stub
		User user=null;
		String sql="select * from user where uname=? and upwd=?";
		ResultSet res = JDBC.executeQuery(sql, uname,upwd);
		try {
			if(res.next()){
				user=new User(uname, upwd, res.getInt(4));
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		String sql="insert into user(uname,upwd,isadmin) values(?,?,?)";
		int line = JDBC.executeNonQuery(sql, user.getUname(),user.getUpwd(),user.getIsadmin());
		if(line>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean getUserByName(String uname) {
		// TODO Auto-generated method stub
		String sql="select * from user where uname=?";
		ResultSet res = JDBC.executeQuery(sql, uname);
		try {
			if(res.next()){
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<User> select() {
		// TODO Auto-generated method stub
		ArrayList<User> users = new ArrayList<User>();
		String sql="select * from user";
		User user=null;
		ResultSet res = JDBC.executeQuery(sql);
		try {
			while(res.next()){
				user=new User(res.getInt("id"), res.getString("uname"), null, res.getInt("isadmin"));
				users.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}
	
}

