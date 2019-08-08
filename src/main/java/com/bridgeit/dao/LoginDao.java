package com.bridgeit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bridgeit.HibernateUtil;
import com.bridgeit.model.User;

public class LoginDao {
	
	public Boolean loginUser(String email, String password) {
//		System.out.println("service class");
//		System.out.println("email="+email+" password="+password);
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		String sql = " from User u where u.email=:email and u.password=:password";
		Query query = session.createQuery(sql);
		query.setParameter("email", email);
		query.setParameter("password", password);
		
		List<User> list = query.list();
		if (list.size() > 0) {
			session.close();
			System.out.println("Login Success");
			return true;
		}
		System.out.println("Login Failed");
		session.close();
		return false;
	}
}
