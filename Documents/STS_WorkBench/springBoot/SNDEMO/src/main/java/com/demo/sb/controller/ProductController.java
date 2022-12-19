package com.demo.sb.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
public class ProductController {

	@GetMapping(path = "/product")
	public String hello() {
		return "Hello, welcome to learn product SpringBoot.";
	}

}
