package com.demo.sb.controller;

import org.springframework.stereotype.Service;

import com.demo.sb.model.Customer;

@Service
public class CustomerServiceImpl {
	/*
	 * @Autowired CustomerDao customerDao;
	 */

	
	public List<Customer> getCustomer() {
		
		System.out.println("======CustomerServiceImpl executed successfully========");
		//return customerDao.getEmployes();
		return null;
	}
}
