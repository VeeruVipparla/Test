package com.snr.demo.test;

public class EmployeeOne implements Cloneable{
	String name;
	int id;

	public EmployeeOne( int id,String name) {
		this.id = id;
		this.name = name;
	}

	void getdata() {
		System.out.println("Student Id ::"+id +"\t"+ "student Name :"+name);
	}
	
	public Object MyClone() throws CloneNotSupportedException{
		return super.clone();
	}
}


