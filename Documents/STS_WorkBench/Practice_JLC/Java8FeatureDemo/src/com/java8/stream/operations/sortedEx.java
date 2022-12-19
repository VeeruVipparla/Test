package com.java8.stream.operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortedEx implements Comparator<Emp> {

	/*
	 * public int compare(Emp e1, Emp e2) {
	 * 
	 * return e1.getEname().compareTo(e2.getEname());
	 * 
	 * }
	 */

	@Override
	public int compare(Emp e1, Emp e2) {
		/*
		 * Integer ageEone=Integer.valueOf(e1.getAge()); Integer
		 * ageEtwo=Integer.valueOf(e2.getAge());
		 */

		Integer eidOne = Integer.valueOf(e1.getEid());
		Integer eidTwo = Integer.valueOf(e2.getEid());

		return eidOne.compareTo(eidTwo);
	}

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("veeru");
		names.add("David");
		names.add("Johnson");
		names.add("Samontika");
		names.add("Brijesh");
		names.add("John");

		List<String> listnames = names.stream().sorted().collect(Collectors.toList());
		listnames.forEach(System.out::println);
		System.out.println("===============================");
		List<Emp> listEmp = new ArrayList<>();
		Emp e3 = new Emp(333, "ethree", "Bangalore", 33);
		Emp e2 = new Emp(222, "etwo", "Bangalore", 22);
		Emp e1 = new Emp(111, "eone", "Bangalore", 11);

		// listEmp.add(e1);
		listEmp.add(new Emp(111, "Veeru", "Bangalore", 11));
		// listEmp.add(e2);
		listEmp.add(new Emp(222, "Raga Spandana", "Hyderbad", 22));
		// listEmp.add(e3);
		listEmp.add(new Emp(333, "Lasya", "New Delhi", 33));

		listEmp.add(new Emp(444, "Nagaraju", "Chennai", 44));

		for (Emp e : listEmp) {
			System.out.println("Eid :: " + e.getEid() + "\t Ename   :: " + e.getEname() + "\t Address :: "
					+ e.getAddress() + "\t age :: " + e.getAge());
		}
		System.out.println("====================================");

		// java7
		System.out.println("============java7 sorting order=============");

		// Collections.sort(listEmp, new SortingOrderEmp());

		Collections.sort(listEmp, new sortedEx());

		for (Emp ee : listEmp) {
			System.out.println("Eid :: " + ee.getEid() + "\t Ename   :: " + ee.getEname() + "\t Address :: "
					+ ee.getAddress() + "\t age :: " + ee.getAge());
		}

		System.out.println("---------------java8 below -----");

		// List<Emp>
		// listEmps=listEmp.stream().sorted(Comparator.comparing(Emp::getEname)).collect(Collectors.toList());

		// List<Emp>
		 //listEmps=listEmp.stream().sorted(Comparator.comparing(Emp::getEid)).collect(Collectors.toList());

		// Comparator<Emp> groupByEmps = Comparator.comparing(Emp::getEname).thenComparing(Emp::getAge);
		

		List<Emp> listEmps = listEmp.stream().sorted(Comparator.comparing(Emp::getEname).thenComparing(Emp::getAge))
				.collect(Collectors.toList());// groupByEmps
		

		for (Emp e11 : listEmps) {
			System.out.println("Eid :: " + e11.getEid() + "\t Ename   :: " + e11.getEname() + "\t Address :: "
					+ e11.
					getAddress() + "\t age :: " + e11.getAge());
		}

	}

}
