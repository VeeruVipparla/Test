package com.java8.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.model.classes.Employee;

public class MaximumUsingStreamMain {

	public static void main(String[] args) {
		List<Employee> employeeList = createEmployeeList();
		List<String> employeeFilteredList = employeeList.stream().filter(e -> e.getAge() > 19 )
				.map(Employee::getname).collect(Collectors.toList());
		employeeFilteredList.forEach((name) -> System.out.println(name));
	}

	private static List<Employee> createEmployeeList() {
		List<Employee> employeeList = new ArrayList<>();
		Employee e1 = new Employee(100, "veeru", 23);
		Employee e2 = new Employee(200, "Rama", 19);
		Employee e3 = new Employee(400, "Raju", 27);
		Employee e4 = new Employee(800, "Lasya", 29);

		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);

		return employeeList;

		
	}

}
