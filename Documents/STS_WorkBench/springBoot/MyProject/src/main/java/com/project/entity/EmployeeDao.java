package com.project.entity;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

	private static Employees list = new Employees();

	static {
		list.getEmployeeList().add(new Employee(1, "Veeru", "Vipparla", "veeruvipparla@gmail.com"));
		list.getEmployeeList().add(new Employee(2, "Raju", "Nagaraju", "RajuNagaraju@gmail.com"));
		list.getEmployeeList().add(new Employee(3, "Rama", "Raju", "RamaRaju@gmail.com"));
		list.getEmployeeList().add(new Employee(4, "Lasya", "Spandana", "LasyaSpandana@gmail.com"));
	}

	public Employees getAllEmployees() {
		return list;
	}

	public void addEmployee(Employee employee) {
		list.getEmployeeList().add(employee);
	}
}
