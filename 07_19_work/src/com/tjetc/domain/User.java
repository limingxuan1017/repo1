package com.tjetc.domain;

public class User {

	private int uid;//用户编号
	private String uname;//用户名
	private String upwd;//密码
	private int isadmin;//是否为管理员=0代表普通,1代表管理员
	
	public User(int uid,String uname, String upwd, int isadmin) {
		super();
		this.uid=uid;
		this.uname = uname;
		this.upwd = upwd;
		this.isadmin = isadmin;
	}

	public User(String uname, String upwd, int isadmin) {
		super();
		this.uname = uname;
		this.upwd = upwd;
		this.isadmin = isadmin;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public int getIsadmin() {
		return isadmin;
	}

	public void setIsadmin(int isadmin) {
		this.isadmin = isadmin;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd + ", isadmin=" + isadmin + "]";
	}
	

}
