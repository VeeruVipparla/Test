package com.test.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductTest {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.getTransaction();
	
		Product p = new Product();
		p.setProdId(119);
		p.setProdName("Audi");
		p.setProdDesc("It is very long");

		tx.begin();
		//session.save(p);
		//Product product =session.get(Product.class, 116);
		//System.out.println("product ID :: "+product.getProdId()+"\t"+" ProdName :: "+product.getProdName()+"\t"+" ProdDesc :: "+product.getProdDesc());
		session.delete(p);
		tx.commit();
		session.close();
		sf.close();
		System.out.println("product inserted successfully");

	}

}
