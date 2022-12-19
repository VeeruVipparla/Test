package com.veeru.util.sb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hibernateutility {

	static Session session;
	static SessionFactory sessionFactory;
	static Transaction transaction;

	static {
		Configuration con = new Configuration();
		con.configure("hibernate.configure.xml");
		System.out.println("The hibernate cfg xml file executed...");
		sessionFactory = con.buildSessionFactory();

	}

	public static Session getSession() {
		session = sessionFactory.openSession();
		System.out.println("The hibernate cfg xml file executed...");
		return session;
	}

	public static SessionFactory getSessionFactory() {
		Configuration con = new Configuration();
		con.configure();
		return sessionFactory;
	}

	public Transaction getTransaction() {
		transaction = session.getTransaction();
		transaction.begin();
		return transaction;
	}

	public static void getCloseConnetion() {
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
