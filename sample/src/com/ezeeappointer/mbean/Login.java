package com.ezeeappointer.mbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Login {

	private String userId;
	private String password;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	public String userLogin(){
		
		if(userId.equals("kumar")&& password.equals("vayyala"))
			return "registration";
		else 
			return "samplelogin";
	}
	
	
}
