package com.demo.sb.service;

import java.util.List;

import com.demo.sb.Employee;

public interface EmployeeService {
	
	List<Employee> getEmployes();

	int deleteEmployes(int eid);

	int updateEmployee(Employee employee);

	int insertEmployee(Employee employee);

	Employee getEmployeeID(int eid);

	

}
