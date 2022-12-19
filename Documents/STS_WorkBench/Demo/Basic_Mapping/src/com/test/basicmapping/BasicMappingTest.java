package com.test.basicmapping;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.test.basicmapping.model.Product;
import com.test.basicmapping.utill.HibernateUtill;


public class BasicMappingTest {

	public static void main(String[] args) {
		Session session=HibernateUtill.getSession();
		Transaction tx=HibernateUtill.getTransaction();
		
		//Employee emp=new Employee(1000,"etwo",new Date(),new Date(),20000.00);
		//emp.setEmpId(null);
		/*Employee emp=new Employee();
		emp.setEmpName("empfour");
		emp.setDoj(new Date());
		emp.setLogin(new Date());
		emp.setSalary(40000.00);
		session.save(emp);*/
		
		Product prod=new Product();
		prod.setProdId(100);
		prod.setProdName("Maruthi Dezire");
		prod.setProdDesc("Indian car millage is 25km per 1L.");
		
		session.save(prod);
		
		HibernateUtill.commitTransaction();
		HibernateUtill.closeSession();

	}

}
