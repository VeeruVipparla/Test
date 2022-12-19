package com.model.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/emp")
public class EmployeeController {
	@Autowired
	EmployeeServiceImpl employeeService;

	@GetMapping("/employees")
	public List<Employee> getAllEmployee() {
		return null;
	}

	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable("id") int id) {
		return null;

	}

	@PostMapping("/employee")
	public void addEmployee(@RequestBody Employee employee) {

	}

	@PutMapping("/employee")
	public void updateEmployee(@RequestBody Employee employee) {

	}

	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable("id") int id) {

	}
}
