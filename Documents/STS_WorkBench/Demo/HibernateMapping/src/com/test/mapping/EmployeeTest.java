package com.test.mapping;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.test.mapping.util.HibernateUtill;

public class EmployeeTest {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
		Session session = HibernateUtill.getSession();
		tx = HibernateUtill.getTransaction();
		System.out.println("==============session===========");
		Query q=session.createQuery("select e.empno, e.name,e.email from employee as e");//
		//q.setParameter("id", 1);
		List list=q.list();
		
		System.out.println("==============list==========="+list);
		
		System.out.println("list values get(0) :: "+list.get(0));
		
		HibernateUtill.commitTransaction();
		
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		

	}

}
