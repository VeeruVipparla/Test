package com.model.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl  {//implements EmployeeService

	@Autowired
	EmployeeRepository employeeRepository;

	public Employee getEmployeeById(int id) {
		return null;
	}

	public List<Employee> getAllEmployees() {
		return null;
	}

	public void saveOrUpdate(Employee employee) {
	}

	public void deleteEmployeeById(int id) {
	}

}
