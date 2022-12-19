package com.model.classes;

public class Employee {

	private int eId;
	private String name;
	private int age;
	
	public Employee(int eId, String name,int age){
		this.eId=eId;
		this.name=name;
		this.age=age;
	}

	public void setEId(int eID) {
		this.eId = eId;
	}

	public int getEId() {
		return eId;
	}

	public void setFirstName(String firstName) {
		this.name = firstName;
	}

	public String getname() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;

	}

	public int getAge() {
		return age;
	}
}
