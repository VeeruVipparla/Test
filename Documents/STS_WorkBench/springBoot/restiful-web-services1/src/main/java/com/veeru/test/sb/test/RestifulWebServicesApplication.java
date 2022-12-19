package com.veeru.test.sb.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.veeru.test.sb.controller")
//@ComponentScan({"com.my.package.first","com.my.package.second"})
public class RestifulWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestifulWebServicesApplication.class, args);
	}

}
