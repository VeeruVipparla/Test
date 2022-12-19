package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.stream.operations.User;

public class SortingExample {
	
/*implements Comparator<Integer> {

	public int compare(Integer o1, Integer o2) {
		
		return o1.compareTo(o2);
	}*/	

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(3);
		list.add(12);
		list.add(67);
		list.add(17);
		list.add(45);
		Object[] obj = list.toArray();

		Collections.sort(list);
		System.out.println(list);

		for (Integer i : list) {
			System.out.println("Value is " + i);
		}

		Employee e1 = new Employee(8278, "Rama", 100000);
		Employee e2 = new Employee(6736, "Veeru", 12346);
		Employee e3 = new Employee(3364, "SNRaju", 1234567);

		List<Employee> listemp = new ArrayList<>();

		listemp.add(e1);
		listemp.add(e2);
		listemp.add(e3);

		System.out.println("=====================");

		List<Employee> empDetails = listemp.stream().sorted(Comparator.comparing(Employee::getSalary))
				.collect(Collectors.toList());
//comparingInt(Employee::getEId)
//comparing(Employee::getName)
		for (Employee emp : empDetails) {
			System.out.println(emp.getEId() + "\t" + emp.getName() + "\t" + emp.getSalary());
		}
	}

}
