package com.veeru.test.sb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.veeru.test.sb.dao.EmployerDao;
import com.veeru.test.sb.model.Employer;

@Service("employerService")
@ComponentScan(basePackages ="com.veeru.test.sb.dao")
public class EmployerServiceImpl implements EmployerService {

	@Autowired
	EmployerDao employerDao;

	
	public Employer insertEmployer(Employer employer) {
    Employer employerData=employerDao.insertEmployer(employer);
	return employerData;
   
	}
}