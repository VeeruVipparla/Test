package com.jlc.constructors;

public class Lab263 {

	public static void main(String[] args) {
		Student2 s1=new Student2(1,"stdnt1","stdnt1@gmail.com",12345);
		s1.show();
		
		Student2 s2=new Student2(2,"stdnt2","stdnt2@gmail.com",11111);
		s2.show();

	}
}

class Student2 {
	int sid;
	String sname;
	String email;
	long phone;

	Student2(int sid, String sname, String email, long phone) {
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.phone = phone;

	}
	Student2(){
		System.out.println("Student Default Constructor");
	}
	void show(){
		System.out.println(sid+"\t"+sname+"\t"+email+"\t"+phone);
	}
}