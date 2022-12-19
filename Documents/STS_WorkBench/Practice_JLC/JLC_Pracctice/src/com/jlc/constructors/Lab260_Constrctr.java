package com.jlc.constructors;

public class Lab260_Constrctr {

	public static void main(String[] args) {
		Student s = new Student();
		
///		s.sid = 100;
//		s.name = "Veeru";
		s.show();

	}

}

class Student {
	int sid=100;
	String name="veeru";

	Student() {
		System.out.println("Student Default Constructor");
	}

	void show() {
		System.out.println(sid + "\t" + name);
	}

}
