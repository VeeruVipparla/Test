package com.java8.stream.operations;

public class Emp {
	private int eid;
	//private String eone;
	private String ename;
	private String address;
	
	private int age;
	
	public Emp() {
		
	}
	
	public Emp(int eid,String ename, String address,int age) {
		super();
		this.eid = eid;
		this.address = address;
		this.ename=ename;
		this.age=age;
	}

	
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	/*
	 * public String getEone() { return eone; }
	 * 
	 * public void setEone(String eone) { this.eone = eone; }
	 */
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
	
	
	
	

}
