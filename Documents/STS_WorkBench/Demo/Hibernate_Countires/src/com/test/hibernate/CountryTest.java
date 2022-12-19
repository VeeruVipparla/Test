package com.test.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CountryTest {

	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		
		SessionFactory sf = con.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx=session.getTransaction();
		Country c=new Country();
		
		c.setsNo(5);
		c.setCountryName("Pakisthan");
		c.setCapital("Ahamdabad");
		c.setCurrency("Rupee");
		c.setPopulation(19);
		
		tx.begin();
		session.save(c);
		tx.commit();
		session.close();
		sf.close();
		
		System.out.println("Country data inserted successfully");

	}

}
