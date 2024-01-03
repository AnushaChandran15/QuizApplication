package com.anushachandran1502.quizapplication.dto;

public class Admin {
	private String userName;
	private String password;
	public Admin(String user, String pwd) {
		userName=user;
		password=pwd;
	}
	public String getuserName() {
		return userName;
	}
	public void setuserName(String name) {
		this.userName = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
