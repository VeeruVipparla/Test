package com.jlc.miscellaneous;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	public class TestEmployee {

	public static void main(String[] args) {
	List<Employee>emp=new ArrayList<Employee>();
	emp.add(new Employee("eone",4000));
	emp.add(new Employee("etwo",6000));
	emp.add(new Employee("ethree",5000));
	
	
	List<Employee> list=listEmp.Stream().filter(i->employee.getsalary(i)>5000).collectors.list());
	list.forEach(System.out::println);
	}

	}
}