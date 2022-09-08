package com.week52.work;

public class User {
	private String userName;
	private String name;
	private String password;
	
	
	public String getUserName() {
		return userName;
	}
	public User(String userName, String name, String password) {
		super();
		this.userName = userName;
		this.name = name;
		this.password = password;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
