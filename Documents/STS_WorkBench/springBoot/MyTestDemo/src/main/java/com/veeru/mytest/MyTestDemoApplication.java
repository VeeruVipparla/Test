package com.veeru.mytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.demo.entity")
public class MyTestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyTestDemoApplication.class, args);
	}

}
