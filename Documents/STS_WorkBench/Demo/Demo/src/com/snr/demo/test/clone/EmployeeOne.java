package com.snr.demo.test.clone;

class EmployeeOne implements Cloneable{
	String name;
	int id;

	public EmployeeOne(String name, int id) {
		this.name = name;
		this.id = id;
	}

	void getdata() {
		System.out.println("Student Id ::"+id +"\t"+ "student Name :"+name);

	}
	
	public Object MyClone() throws CloneNotSupportedException{
		return super.clone();
	}

}
