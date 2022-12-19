package com.veeru.test.sb.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.veeru.test.sb.model.Laptop;
import com.veeru.test.sb.util.HibernateUtil;

@Repository("laptopDao")
//@Transactional
public class LaptopDaoImplHibernate implements LaptopDao {
	Laptop laptopData = new Laptop();

	@Override
	public Laptop insertLaptop(Laptop laptop) throws Exception {
		try {
			Session session = HibernateUtil.getSession();
			Transaction transaction = session.getTransaction();
			transaction.begin();
			session.save(laptop);

			laptopData = (Laptop) session.get(Laptop.class, laptop.getsNumber());
			transaction.commit();
			//session.close();
			// HibernateUtil.getCloseConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return laptopData;
	}

	@Override
	public Laptop updatelaptop(Laptop laptop) throws Exception {
		Session session = HibernateUtil.getSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		session.update(laptop);
		transaction.commit();
		return laptop;
	}

	@Override
	public Laptop getlaptop(int sNumber) throws Exception {
		Laptop lap = null;
		Session session = HibernateUtil.getSession();
		Transaction transaction = HibernateUtil.getTransaction();
		

		/*String hql = "select lp.snumber,lp.name, lp.model from laptop2 as lp where snumber=:sno";
		Query q = session.createQuery(hql);
		q.setParameter("sno", sNumber);
		List<Laptop> laptopList = q.list();
		return laptopList.get(0);
		*/

		lap = (Laptop) session.get(Laptop.class, sNumber);
		
		  if (null != lap) { 
			  return lap;
			  }
		 
		//HibernateUtil.getCloseConnection();
		
		return lap;

	}

	@Override
	public List<Laptop> getlaptop() throws Exception {
		List<Laptop> listLaptopData = new ArrayList<>();
		Session session = HibernateUtil.getSession();
		Transaction transaction = HibernateUtil.getTransaction();
		/*
		 * Query q=session.createQuery("from laptop2"); List<Laptop>
		 * listLaptopData=q.list();
		 */

		Criteria c = session.createCriteria(Laptop.class);
		listLaptopData = c.list();
		//HibernateUtil.getCloseConnection();
		return listLaptopData;
	}

	@SuppressWarnings("unchecked")
	@Override
	public int deletelaptop(int sNumber) throws Exception {
		Session session = HibernateUtil.getSession();
		Transaction transaction = HibernateUtil.getTransaction();
		//session.delete("delete from laptop2 where snumber=" + sNumber);
		
		Laptop lap = (Laptop) session.load(Laptop.class, sNumber);
		if (null != lap) {
            session.delete(lap);
        }
		
		System.out.println("==========delete the record successfully==================");
		//HibernateUtil.getCloseConnection();
		return 1;
	}

}
