package com.veeru.test.sb.controller;

import java.util.List;

import javax.validation.metadata.MethodType;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.veeru.test.sb.model.Customer;
import com.veeru.test.sb.service.CustomerService;

@RestController
@RequestMapping(value ="/customer")
@ComponentScan(basePackages = "com.veeru.test.sb.service")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
@PostMapping(path="/insert") // /customer/insert
public Customer insertCustomer(@RequestBody Customer customer) {
	Customer customerData=customerService.insertCustomer(customer);
	return customerData;
}
/*
@GetMapping(path="/get/{cid}") //   /customer/get/100
public int  insert(@PathVariable int cid ) {
	return cid ;
}



@GetMapping(path="/get") //   /customer/get
public int  insertCid(@RequestParam int cid, @RequestParam String cname ) {
	System.out.println("cid  :: "+cid +"\t cname :: "+cname);
	return cid ;
}

*/

@PutMapping(path="/update") // /customer/update
public Customer updateCustomer(@RequestBody Customer customer) {
	Customer customerData=customerService.updateCustomer(customer);
	return customerData;
}
@GetMapping("/get/{cid}")
public Customer getCustomer(@PathVariable int cid) {
	Customer customer=customerService.getCustomer(cid);
	return customer;
	
}

@GetMapping("/get")
public List<Customer> getCustomer() {
	List<Customer> customerlist=customerService.getCustomer();
	return customerlist;
	
}
@DeleteMapping(path="/delete/{cid}") // /customer/delete
public String deleteCustomer(@PathVariable int cid) {
	int rowDelete=customerService.deleteCustomer(cid);
	if(rowDelete>0) {
		return "The deleted Data from the DB successfully based CID";
	}
	return "The deleted Data from the DB is not successfully based CID";
}

@DeleteMapping(path="/delete") // /customer/delete  with Query Parameter cid
public String deleteCustomerCid(@RequestParam int cid) {
	int rowDelete=customerService.deleteCustomer(cid);
	if(rowDelete>0) {
		return "The deleted Data from the DB successfully based CID";
	}
	return "The deleted Data from the DB is not successfully based CID";
}


}