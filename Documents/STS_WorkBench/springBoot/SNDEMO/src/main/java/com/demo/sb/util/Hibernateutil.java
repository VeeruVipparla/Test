package com.demo.sb.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hibernateutil {
	
	static SessionFactory sf;
	static Session session;
	static Transaction tx;
	
	
	  public static Session getSession() {
		  Configuration config=new Configuration();
		  config.configure();
		   sf= config.buildSessionFactory();
		   session=sf.openSession();
		return session;
	  }
	  
	  public static Transaction getTransaction() {
		   try {
			tx=session.getTransaction();
			tx.begin();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		return tx;  
		
	}
	  
	  public static void closeConnection() {
		  tx.commit();
		  sf.close();
		  session.close();  
	  }
	

}
