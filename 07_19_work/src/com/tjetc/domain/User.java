package com.tjetc.domain;

public class User {

	private int uid;//�û����
	private String uname;//�û���
	private String upwd;//����
	private int isadmin;//�Ƿ�Ϊ����Ա=0������ͨ,1�������Ա
	
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
