package com.project.entity;

public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private String email;

	public Employee(int id, String firstName, String lastName, String email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;

	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "Employee Details[ EmpId--" + id + "Emp FirstName--" + firstName + "Emp LastName--" + lastName
				+ "Emp Email--" + email;
	}

}
