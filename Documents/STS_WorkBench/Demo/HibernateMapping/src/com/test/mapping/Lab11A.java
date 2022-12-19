package com.test.mapping;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.test.mapping.util.HibernateUtill;

public class Lab11A {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			Session session = HibernateUtill.getSession();
			tx = HibernateUtill.getTransaction();

			Address ad = new Address();
			ad.setAid(8);
			ad.setStreet("sarjapur");
			ad.setCity("Banglore");
			ad.setState("Karnataka");
			ad.setZipcode("560037");

			Customer c = new Customer(10, "SNR", "Sri", "snr@gmail.com", "1431");
			/*
			 * c.setCustomerId(2); c.setFirstName("veeru"); c.setLastName("v");
			 * c.setEmail("veeru@gmail.com");
			 */

			session.save(ad);
			c.setAddress(ad);
			session.save(c);
			session.load(Address.class, 4);
			Customer cust=session.load(Customer.class, 4);
			//street       | city     | state     | zipcode
			/*
			 * Query q=session.
			 * createQuery("select c.cid,c.firstname, c.lastname,c.email, c.phone, a.street,a.city,a.state, a.zipcode from customer as c inner join address as a where c.cid=:id"
			 * );// q.setParameter("id", 1);
			 * 
			 * List<Customer> list=q.list();
			 * 
			 * System.out.println("list values :: "+list.get(0));
			 */
			
			
			
			
			
			  System.out.println(cust.getCustomerId()+"\t"+cust.getFirstName() +"\t"+
			  cust.getLastName()+"\t"+cust.getPhone()+"\t"+
			  cust.getAddress().getAid()+"\t"+ cust.getAddress().getStreet()+"\t"+
			  cust.getAddress().getCity()+"\t"+ cust.getAddress().getState()+"\t"+
			  cust.getAddress().getZipcode()
			  
			  );
			  
			  System.out.println("===========Criteria=================");
			  Criteria ct=session.createCriteria(Customer.class);
			  Criterion criterion=Restrictions.eq("customerId", 3);
			  ct.add(criterion);
			  
			  List<Customer> list= ct.list();
			  System.out.println("list :: "+list.get(0));
			  System.out.println("============================");
			  for(Customer customer:list) {
				  System.out.println(customer.getCustomerId()+"\t"+customer.getFirstName() +"\t"+
						  customer.getLastName()+"\t"+customer.getPhone()+"\t"+
						  customer.getAddress().getAid()+"\t"+ customer.getAddress().getStreet()+"\t"+
						  customer.getAddress().getCity()+"\t"+ customer.getAddress().getState()+"\t"+
						  customer.getAddress().getZipcode()
						  
						  );
				  
			  }
			  
			 
			 
			

			tx.commit();
			session.close();
			System.out.println("Record inserted");

		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}

	}
}