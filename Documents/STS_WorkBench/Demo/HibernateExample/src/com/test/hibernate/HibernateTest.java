package com.test.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx=session.getTransaction();
		
		Employee emp=new Employee();
		emp.setEmpno(1111);
		emp.setName("Veeru11");
		emp.setEmail("Veeru.vipparla11@gmail.com");
		tx.begin();
		session.get(Employee.class, 1111);
		tx.commit();
		
		session.close();
		sf.close();
		System.out.println("Employee inseted successfully");

	}

}
