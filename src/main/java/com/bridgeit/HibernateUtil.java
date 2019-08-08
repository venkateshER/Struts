package com.bridgeit;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory;
	static {
		try {
			sessionFactory = new AnnotationConfiguration().configure()
					.buildSessionFactory();
		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}
	public static Session getSession() throws HibernateException {
		return sessionFactory.openSession();
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
//	private static SessionFactory sessionFactory = null;
//
//	@SuppressWarnings("deprecation")
//	public static SessionFactory getSessionFactory()
//	{
//	
//		if(sessionFactory==null)
//		{
//			Configuration configuration= new Configuration().configure("hibernate.cfg.xml");
//			sessionFactory=configuration.buildSessionFactory();
//			
//		}
//		return sessionFactory;
//		
//	}
	
} 
