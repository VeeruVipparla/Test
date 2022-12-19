package com.veeru.test.sb.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.veeru.test.sb.dao.CustomerDAO;
import com.veeru.test.sb.model.Customer;

@Service("customerService")
@ComponentScan(basePackages = "com.veeru.test.sb.dao")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDAO customerDAO;

	@Override
	public Customer insertCustomer(Customer customer) {
		Customer customerData = customerDAO.insertCustomer(customer);
		return customerData;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		Customer customerData = customerDAO.updateCustomer(customer);
		return customerData;
	}

	@Override
	public int deleteCustomer(int cid) {
		return customerDAO.deleteCustomer(cid);

	}

	@Override
	public Customer getCustomer(int cid) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomer(cid);
	}

	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		List<Customer> listCustomer = customerDAO.getCustomer();
		List<Customer> listSortOrderCustomer = sortOrderCustomer(listCustomer);
		return listSortOrderCustomer;
	}

	private List<Customer> sortOrderCustomer(List<Customer> listCustomer) {

		List<Customer> sortOderCustomer = listCustomer.stream()
				.sorted(Comparator.comparingInt(Customer::getCid).reversed()).collect(Collectors.toList());

		return sortOderCustomer;
	}
/*
	@Override
	public Customer insertOne(Customer customer) {
		Customer customerData = customerDAO.insertOne(customer);
		return customerData;
	}
*/
}
