package com.bridgeit.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.bridgeit.dao.LoginDao;
import com.opensymphony.xwork2.ActionSupport;
@Namespace("/")
@ResultPath(value="/")
@Action(value="dashBoard",results={@Result(name="success",location="dashBoard.jsp"),
		@Result(name="error",location="error.jsp")})

public class LoginAction extends ActionSupport{
	
	private String email;
	private String password;

	public String execute() {
		LoginDao login=new LoginDao();
		if(login.loginUser(email, password)) {
			return SUCCESS;
		}
		else {
			return ERROR;
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
