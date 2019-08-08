package com.bridgeit.action;

import java.util.List;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import com.bridgeit.dao.UserDao;
import com.bridgeit.model.User;
import com.opensymphony.xwork2.ActionSupport;

@Namespace("/")
@ResultPath(value="/")
@Action(value="users", results={@Result(name="success",location="allUsers.jsp"),
		@Result(name="none",location="allUsers.jsp")})
public class UserList extends ActionSupport {

	private User user;
	private UserDao userService;
	private List<User> userList;
	private int id;
	public UserList() {
		userService=new UserDao();
	}
	public String execute(){
		
//		UserDao userService1=new UserDao();
		this.userList=userService.getUserList();
		
		for(User users:this.userList) {
			System.out.println(users);
		}
		
		return SUCCESS;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	
}
