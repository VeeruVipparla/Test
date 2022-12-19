package com.jlc.set.intrface;

import java.util.HashSet;

public class Lab626 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new Student(99, "Veeru"));
		set.add(new Student(100, "veeru"));
		set.add(new Student(99, "Rutvik"));
		set.add(new Student(116, "veeru"));
		set.add(345);
		set.add(345);
		set.add(345);
		Object obj[] = set.toArray();
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}

		System.out.println(set);

	}

}

class Student {
	int sid;
	String sname;

	Student(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;
	}

	public String toString() {
		return "" + sid + "\t" + sname;// Cannot reduce the visibility of the inherited method from Object

	}
}