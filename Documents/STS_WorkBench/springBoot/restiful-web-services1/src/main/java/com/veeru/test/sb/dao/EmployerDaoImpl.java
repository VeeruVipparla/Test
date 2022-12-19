package com.veeru.test.sb.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.veeru.test.sb.model.Employer;
import com.veeru.test.sb.util.HibernateUtil;

@Repository("employerDao")
public class EmployerDaoImpl implements EmployerDao {

	@Override
	public Employer insertEmployer(Employer employer) {
		Employer employerData=new Employer();
		try {
			
			Session session=HibernateUtil.getSession();
			Transaction transaction=session.getTransaction();
			transaction.begin();
			session.save(employer);
			
			employerData=(Employer)session.get(Employer.class, employer.geteId());
			System.out.println("employerData :: "+employerData.geteId()+""+employerData.getName());
			transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return employer;
	}

}

