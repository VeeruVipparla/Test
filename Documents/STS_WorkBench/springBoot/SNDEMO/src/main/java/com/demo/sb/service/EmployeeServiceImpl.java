package com.demo.sb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.demo.sb.Employee;
import com.demo.sb.dao.EmployeeDao;

@Service
//@ComponentScan(basePackages ="com.test.sb.dao")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;

	@Override
	public List<Employee> getEmployes() {
		// TODO Auto-generated method stub
		System.out.println("======EmployeeServiceImpl executed successfully========");
		return employeeDao.getEmployes();
	}

	@Override
	public int deleteEmployes(int eid) {
		
		return employeeDao.deleteEmployes(eid);
	}

	@Override
	public int updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.updateEmployee(employee);
	}

	@Override
	public int insertEmployee(Employee employee) {
		int i=employeeDao.insertEmployee(employee);
		return i;
	}

	@Override
	public Employee getEmployeeID(int eid) {
		return employeeDao.getEmployeeID(eid);
	}

}
