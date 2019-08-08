package com.bridgeit.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bridgeit.HibernateUtil;
import com.bridgeit.model.User;


public class ForgotDao {
	
	 public boolean forgotPassword(String email, String password){
		 Session session = HibernateUtil.getSession();
			session.beginTransaction();
			String sql = " from User u where u.email=:email";
			Query query = session.createQuery(sql);
			query.setParameter("email", email);

			User user = (User) query.uniqueResult();
			if (user != null) {
				user.setPassword(password);
				session.save(user);
				session.getTransaction().commit();
				session.close();
				return true;
			}
			session.close();
			return false;
	  }

}
