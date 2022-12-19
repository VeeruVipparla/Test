package com.demo.sb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.sb.model.Customer;

@RestController
public class CustomerController {
	
	
	  @Autowired 
	  CustomerService customerService;
	 
	
	@GetMapping(path="/hello/customer")
	public String hello(@RequestBody Customer customer) {
		customerService.insert(customer);
		
		return "Hello,"+ customer.getCid()+"Spring boot training Started";
		
	}
	
	@GetMapping("/hello/str/{str}")
	public String heloShow(@PathVariable String str) {
		return "Hello "+str+", Spring boot training Started now ............" ;
		
	}
	
	
}

