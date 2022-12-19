package com.jlc.constructors;

public class Lab262 {

	public static void main(String[] args) {
		Student1 stu = new Student1(88, "Veeru");
		stu.show();
		Student1 stu1 = new Student1(99, "Veera");

	}

}

class Student1 {
	int sid;
	String sname;

	Student1(int sid, String sname) {
		System.out.println("Student 2Arg Constructor");
		this.sid = sid;
		this.sname = sname;
		
	}

	void show() {
		System.out.println(sid + "\t" + sname);
	}
}