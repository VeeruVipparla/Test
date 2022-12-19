/**
 * 
 */
package com.veeru.test.sb.dao;

import java.util.List;

import com.veeru.test.sb.model.Customer;

/**
 * @author veeru
 *
 */
public interface CustomerDAO {
	public Customer insertCustomer(Customer customer);

	public Customer updateCustomer(Customer customer);

	public int deleteCustomer(int cid);

	public Customer getCustomer(int cid);

	public List<Customer> getCustomer();

	//public  Customer insertOne(Customer customer);
		
	

}
