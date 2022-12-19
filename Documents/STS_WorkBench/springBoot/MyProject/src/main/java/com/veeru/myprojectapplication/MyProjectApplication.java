package com.veeru.myprojectapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@SpringBootApplication
@ComponentScan("com.project.entity")
public class MyProjectApplication {
/*
	@RequestMapping(value ="/veeru")
	public String home() {
		return "<h1> Welcome come to my World <h1>";
	}
	 
	@GetMapping(value="car")
	public String getItem() {
		return "<h1> Spring Boot Learning <h1>";
		
	}
*/	
	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
		
	}

}
