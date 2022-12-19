package com.test.basicmapping.utill;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtill {

	private static SessionFactory sf = null;// HibernateUtill
	private static Session session = null;
	private static Transaction tx = null;

	public static Session getSession() {
		try {
			Configuration con = new Configuration();
			con.configure("hibernate.cfg.xml");
			SessionFactory sf = con.buildSessionFactory();
			session = sf.openSession();
			// tx = session.getTransaction();
			// return session;

		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return session;

	}

	public static void closeSession() {
		session.close();

	}

	public static Transaction getTransaction() {
		tx = session.getTransaction();
		tx.begin();
		return tx;
	}

	public static void commitTransaction() {
		tx.commit();

	}

}
