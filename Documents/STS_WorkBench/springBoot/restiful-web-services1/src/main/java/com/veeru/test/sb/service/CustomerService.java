/**
 * 
 */
package com.veeru.test.sb.service;

import java.util.List;

import com.veeru.test.sb.model.Customer;

/**
 * @author veeru
 *
 */
public interface CustomerService {

	public Customer insertCustomer(Customer customer);

	public Customer updateCustomer(Customer customer);

	public int deleteCustomer(int cid);

	public Customer getCustomer(int cid);

	public List<Customer> getCustomer();
	
//	public Customer insertOne (Customer customer);

	//public Customer deleteCustomer(Customer customer);
	
}
