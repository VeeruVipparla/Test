package com.veeru.test.sb.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	static Session session;
	static SessionFactory sessionFactory;
	static Transaction transaction;

	static {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		System.out.println("The hibernate cfg xml file executed...");
		sessionFactory = conf.buildSessionFactory();
	}

	public static Session getSession() {
		try {
			session = sessionFactory.openSession();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return session;

	}

	public static SessionFactory getSessionFactory() {
		Configuration conf = new Configuration();
		conf.configure();
		sessionFactory = conf.buildSessionFactory();
		return sessionFactory;
	}

	public static Transaction getTransaction() {
		try {
			transaction = session.getTransaction();
			transaction.begin();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return transaction;

	}

	public static void getCloseConnection() {
		transaction.commit();
		session.close();
		sessionFactory.close();

	}

}
