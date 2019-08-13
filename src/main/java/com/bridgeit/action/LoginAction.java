package com.bridgeit.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.bridgeit.dao.LoginDao;
import com.bridgeit.dao.UserDao;
import com.bridgeit.model.User;
import com.opensymphony.xwork2.ActionSupport;
@Namespace("/")
@ResultPath(value="/")
@InterceptorRef(value="loggingStack")
@ParentPackage(value ="default")
@Action(value="dashBoard",results={@Result(name="success",location="dashBoard.jsp"),
		@Result(name="error",location="error.jsp")})

public class LoginAction extends ActionSupport{
	
	private String email;
	private String password;
	private User user;
	private UserDao userService;
	private List<User> userList;
	private int id;
	public LoginAction() {
		userService=new UserDao();
	}

	public String execute() {
		LoginDao login=new LoginDao();
		if(login.loginUser(email, password)) {
			this.userList=userService.getUserList();
			
			for(User users:this.userList) {
				System.out.println(users);
			}
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserDao getUserService() {
		return userService;
	}

	public void setUserService(UserDao userService) {
		this.userService = userService;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
