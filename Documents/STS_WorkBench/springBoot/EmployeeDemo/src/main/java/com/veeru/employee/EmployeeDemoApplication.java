package com.veeru.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.model.entity")
@SpringBootApplication
public class EmployeeDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDemoApplication.class, args);
	}

}
