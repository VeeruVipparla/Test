package com.veeru.test.sb.model;

public class User {
	int id;
	String username;
	
	public User() {
		
	}
	
	public User(int id, String username) {
		super();
		this.id = id;
		this.username = username;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	
	
	

}
