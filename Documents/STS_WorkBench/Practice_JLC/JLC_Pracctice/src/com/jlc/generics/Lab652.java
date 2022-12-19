package com.jlc.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Lab652 {

	public static void main(String[] args) {
		ArrayList<String> emails = new ArrayList<>();
		emails.add("KeralaTourism.@gmail.com");
		emails.add("ChennaiTourism.@gmail.com");
		emails.add("AndhraTourism.@gmail.com");

		ArrayList<Long> phones = new ArrayList<Long>();
		phones.add(9988774433L);
		phones.add(9988774422L);
		phones.add(9988774411L);

		LinkedHashMap<String, Long> refs = new LinkedHashMap<>();
		refs.put("Veeru", 9978876644L);
		refs.put("Mani", 9978876633L);
		refs.put("Gopi", 9978876622L);

		Employee emp = new Employee(100, "PawanKalyan", emails, phones, refs);

		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(emp);
		empList.add(emp);
		empList.add(emp);
		empList.add(emp);

		//System.out.println(stList);
		Iterator it=empList.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}

class Employee {
	int eid;
	String name;
	List<String> emails;
	List<Long> phones;
	Map<String, Long> refs;

	public Employee(int eid, String name, List<String> emails, List<Long> phones, Map<String, Long> refs) {
		this.eid = eid;
		this.name = name;
		this.emails = emails;
		this.phones = phones;
		this.refs = refs;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", emails=" + emails + ", phones=" + phones + ", refs="
				+ refs + "]";
	}
}
