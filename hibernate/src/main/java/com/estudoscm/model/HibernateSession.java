package com.estudoscm.model;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSession {
	
	private static final SessionFactory sessionFactory =  buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		try {
			return new Configuration().configure().buildSessionFactory();
		} catch(Throwable ex) {
			System.err.print(ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void close() {
		getSessionFactory().close();
	}

}
