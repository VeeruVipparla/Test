package com.test.hql;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.test.mapping.util.HibernateUtill;

public class HQL_Test {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
		Session session = HibernateUtill.getSession();
		tx = HibernateUtill.getTransaction();
		System.out.println("==============session===========");
		//Criteria c=session.createCriteria(Employee.class);
		//List<Employee> list=c.list();
		
		Query q=session.createQuery("select e.empno, e.name, e.email from employee as e where e.empno=12");
		
		List<Employee> list=((Criteria) q).list();
		
		for(Employee emp:list) {
			System.out.println("Empno :: "+emp.getEmpno());
			System.out.println("Emp Name :: "+emp.getName());
			System.out.println("Emp email :: "+emp.getEmail());
		}
		/*
		 * Query
		 * q=session.createQuery("select e.empno, e.name,e.email from employee as e");//
		 * //q.setParameter("id", 1); List list=q.list();
		 */
		
		System.out.println("==============list==========="+list.get(0).getEmpno()+"\t ename"+list.get(0).getName()+"\t email ::"+list.get(0).getEmail() );
		
		System.out.println("list values get(0) :: "+list.get(1).getEmpno());
		
		HibernateUtill.commitTransaction();
		
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
