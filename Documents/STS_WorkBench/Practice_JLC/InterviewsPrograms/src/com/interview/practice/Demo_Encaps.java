package com.interview.practice;

class Employee1 {
	private String name;
	private long number;
	

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNumber(long number) {
		this.number = number;

	}

	public long getNumber() {
		return number;
	}
}

public class Demo_Encaps {
	public static void main(String args[]) {
		Employee1 e = new Employee1();
		e.setName("Veeru");
		e.setNumber(7893624102L);
		System.out.println("Name of the Employee::-" + e.getName());
		System.out.println("Number of the Employee::-" + e.getNumber());
	}
}