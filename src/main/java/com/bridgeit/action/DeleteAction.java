package com.bridgeit.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.bridgeit.dao.UserDao;
import com.opensymphony.xwork2.ActionSupport;

@Namespace("/")
@ResultPath(value="/")
@Action(value="delete", results={@Result(name="success",location="index.jsp"),
		@Result(name="error",location="index.jsp")})
public class DeleteAction extends ActionSupport{
	
	private int id;
	
	public String execute() {
		UserDao userService=new UserDao();
		if(userService.delete(getId())) {
		return SUCCESS;
		}
		else {
			return ERROR;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
