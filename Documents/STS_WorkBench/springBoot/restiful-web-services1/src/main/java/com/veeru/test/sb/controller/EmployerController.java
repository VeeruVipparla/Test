package com.veeru.test.sb.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veeru.test.sb.model.Employer;
import com.veeru.test.sb.service.EmployerService;

@RestController
@RequestMapping(value = "/employer")
@ComponentScan(basePackages = "com.veeru.test.sb.service")
public class EmployerController {
	//Logger logger=

	@Autowired
	EmployerService employerService;

	@PostMapping(path = "/insert")//  /employer/insert
	public Employer insertEmployer(@RequestBody Employer employer) {
		System.out.println("data :: "+employer.geteId()+"\t"+employer.getName());
		Employer employerData = employerService.insertEmployer(employer);
		return employerData;

	}

}
