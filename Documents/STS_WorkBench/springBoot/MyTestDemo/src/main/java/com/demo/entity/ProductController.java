package com.demo.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value ="/")
public class ProductController {

	@Autowired
	IProductService productService; 
	
	@GetMapping(value ="/product")
	public List<Product> getProduct(){
		
		 List<Product> products=productService.findAll();
		
		return products;
		
	}
	@GetMapping(value ="/product/{id}")
	public Product getProduct(@PathVariable("id") int id) {
		return productService.getProductById(id);
		
	}
	
	
}
