package com.bridgeit.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.bridgeit.dao.UserDao;
import com.bridgeit.model.User;
import com.opensymphony.xwork2.ActionSupport;



@Namespace("/")
@ResultPath(value="/")
@Action(value="result", results={@Result(name="success",location="login.jsp"),
		@Result(name="error",location="user.jsp")})

public class RegisterAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private String name;
	private String email;
	private int age;
	private String password;
	
	public String execute() {
		   User user = new User(name, email, age,password);	
		   UserDao userDao = new UserDao();
		   if(userDao.saveUserDetail(user)) {
		   return SUCCESS; 
		   }
		   else {
			   return ERROR;
		   }
		}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
