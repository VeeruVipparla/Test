package com.snr.demo.test;

public class Student {
	int sid;
	String sname;
	public Student(int sid, String sname) {
		System.out.println("Student object is created:");
		this.sid = sid;
		this.sname = sname;
	}
	
	void show() {
		System.out.println("student id :"+sid +"\t"+ "Student Name"+sname);
		
	}
	

}


