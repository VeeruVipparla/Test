package com.veeru.controller.sb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veeru.model.sb.Product;
import com.veeru.sevice.sb.ProductService;

@RestController
@RequestMapping(value = "/product")
@ComponentScan(basePackages = "com.veeru.sevice.sb")
public class ProductController {

	@Autowired
	ProductService productService;

	@PostMapping(value="/insert")// ///product/insert
	public Product insertProduct(@RequestBody Product product) {
		Product productData = new Product();
		productData = productService.insertProduct(product);
		return productData;

	}

}
