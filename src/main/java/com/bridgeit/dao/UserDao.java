package com.bridgeit.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.bridgeit.HibernateUtil;
import com.bridgeit.model.User;

public class UserDao extends HibernateUtil {
	  public boolean saveUserDetail(User user){
		    Session session = HibernateUtil.getSession();
		    session.beginTransaction();
		    String email=user.getEmail();
//		    System.out.println(email);
		    String sql="from User u where u.email=:email";
		    Query query = session.createQuery(sql);
			query.setParameter("email", email);
			User user1 = (User) query.uniqueResult();
			if(user1!=null) {
				session.close();
				System.out.println("Email exits");
				return false;
			}
			else {
			session.save(user);
			session.getTransaction().commit();
			session.close();
			System.out.println("Saved SuccessFully");
			return true;
			}
	  }	
	  
	  public List<User> getUserList(){
//	        List<User> userList = null;
//	       
//	            Session session = HibernateUtil.getSession();
//	            String sql = "from User";
//	            Query query = (Query) session.createQuery(sql).list();
////	            userList = query.list();
//	            System.out.println("Total Users="+userList.toString());
////	            System.out.println("abcd");
//	            session.flush();
//	            return userList;
//	    }
		  Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			List<User> user = null;
			try {
				
				user = (List<User>)session.createQuery("from User").list();
				
			} catch (HibernateException e) {
				e.printStackTrace();
				session.getTransaction().rollback();
			}
			session.getTransaction().commit();
			return user;
		}
	  
	  public boolean update(int id, String name){
			 Session session = HibernateUtil.getSession();
				session.beginTransaction();
				String sql = " from User u where u.id=:id";
				Query query = session.createQuery(sql);
				query.setParameter("id", id);

				User user = (User) query.uniqueResult();
				if (user != null) {
					user.setName(name);
					session.save(user);
					session.getTransaction().commit();
					session.close();
					return true;
				}
				session.close();
				return false;
		  }

	  
	  public boolean delete(int id) {
		  
		  System.out.println("Id="+id);
		  Session session=HibernateUtil.getSession();
		  session.beginTransaction();
		  String sql="from User u where u.id=:id";
		  Query query=session.createQuery(sql);
		  query.setParameter("id", id);
		  User user=(User) query.uniqueResult();
//		  User user=(User)session.load(User.class, id);
		  if(user!=null) {
			  
			  session.delete(user);
			  session.getTransaction().commit();
			  System.out.println("Delete SuccessFully");
			  session.close();
			  return true;
		  }	  
		  else {
			  System.out.println("User Not Found");
			  session.close();
			  return false;
		  }	  
		  
	  }


	} 
