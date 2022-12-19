package com.jlc.string;

public class Lab473 {

	public static void main(String[] args) {
		Student s1 = new Student();
		String s2 = String.valueOf(s1);
		System.out.println(s1);

		Employee e1 = new Employee();
		String s3 = String.valueOf(e1);
		System.out.println(s3);

	}

}

class Student {
}

class Employee {
	int eid;

	public String toString() {
		return "Eid:" + eid;

	}
}
