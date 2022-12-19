package com.test.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sf = null;// HibernateUtill
	private static Session session = null;
	private static Transaction tx = null;

	public static Session getSession() {
		try {
			Configuration con = new Configuration();
			con.configure("hibernate.cfg.xml");
			SessionFactory sf = con.buildSessionFactory();
			session = sf.openSession();
			
			System.out.println("====connected the DB with Session======");
			 //tx = session.getTransaction();
		//return session;

		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return session;

	}

	public static void closeSession() {
		session.close();

	}

	public static Transaction getTransaction() {
		tx = session.beginTransaction();
		tx.begin();
		return tx;
	}

	public static void commitTransaction() {
		tx.commit();
		session.close();

	}

}