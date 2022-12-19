package com.mappingtest;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hbr.mapping.Aspirant;
import com.hbr.mapping.Job;
import com.mapping.util.HibernateUtil;



public class Many2OneTest {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			Session session = HibernateUtil.getSession();
			tx = HibernateUtil.getTransaction();
			
			
			Aspirant as=new Aspirant();
			as.setaId(1);
			as.setaName("veeru");
			as.setaJob("Software");
			
			Job j=new Job();
			
			

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

		} catch (Exception e) {
			e.printStackTrace();
	}

}
}