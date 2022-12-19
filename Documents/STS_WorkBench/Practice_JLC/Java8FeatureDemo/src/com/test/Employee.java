package com.test;

public class Employee {

	private int eId;
	private String name;
	private float salary;

	
	Employee(int eId,String name,float salary){
		this.eId=eId;
		this.name=name;
		this.salary=salary;
	}
	
	public void setEId(int eId) {
		this.eId = eId;
	}

	public int getEId() {
		return eId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSalary() {
		this.salary = salary;
	}

	public float getSalary() {
		return salary;
	}

	
}
