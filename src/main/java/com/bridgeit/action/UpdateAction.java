package com.bridgeit.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.bridgeit.dao.UserDao;
import com.opensymphony.xwork2.ActionSupport;

@Namespace("/")
@ResultPath(value="/")
@Action(value="update", results={@Result(name="success",location="login.jsp"),
		@Result(name="error",location="update.jsp")})
public class UpdateAction extends ActionSupport {
	
	private String name;
	private int id;
	
	public String exe() {
		return NONE;
	}
	public String execute() {
//		String name="dbfhdhbf";
//		System.out.println("Action="+name);
		UserDao userService=new UserDao();
	//	System.out.println(userService.toString());
		if(userService.update(id,name)) {
			System.out.println("Update Success");
		return SUCCESS;
		}
		else {
			System.out.println("Update Failed");
			return ERROR;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
