package com.veeru.springbootexample_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.veeru.controller.sb")
public class SpringBootExample2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExample2Application.class, args);
	}

}
