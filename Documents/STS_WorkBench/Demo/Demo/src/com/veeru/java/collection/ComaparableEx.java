package com.veeru.java.collection;

import java.util.Iterator;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {
	
	int id;
	String name;
	int age;

	public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Employee emp) {
		//if (obj instanceof Employee) {
			//Employee employee = (Employee) obj;
			// return this.id-employee.id;
			// return this.age - employee.age;
			return this.name.compareToIgnoreCase(emp.name);
			// return this.name.compareTo(employee.name);
		//}
		//return 0;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

public class ComaparableEx {

	public static void main(String[] args) {

		Employee e1 = new Employee(400, "rutvik", 05);
		Employee e2 = new Employee(200, "Veeru", 10);
		Employee e3 = new Employee(300, "lasya", 20);
		Employee e4 = new Employee(100, "Nag", 30);

		TreeSet<Employee> list = new TreeSet<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		System.out.println("list :: " + list);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);

		}

	}

}
