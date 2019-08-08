package com.bridgeit.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.bridgeit.dao.ForgotDao;
import com.bridgeit.dao.LoginDao;
import com.opensymphony.xwork2.ActionSupport;

@Namespace("/")
@ResultPath(value="/")
@Action(value="forgot", results={@Result(name="success",location="login.jsp"),
		@Result(name="error",location="forgotPassword.jsp"),
		@Result(name="none",location="forgotPassword.jsp")})

public class ForgotAction extends ActionSupport{
	
	private String email;
	private String password;
	private String confirmPassword;

	public String execute() {
		if(password.equals(confirmPassword)) {
		ForgotDao fp=new ForgotDao();
		if(fp.forgotPassword(email, password)) {
			return SUCCESS;
		}
		
		else {
			return ERROR;
		}
		}
		return NONE;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
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
