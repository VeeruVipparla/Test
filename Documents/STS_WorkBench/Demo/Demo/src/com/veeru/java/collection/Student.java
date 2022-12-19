package com.veeru.java.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class Student {
	int sid;
	String name;

	Student(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}

	public String toString() {
		return sid + "\t" + name;

	}

}

class NameComarator implements Comparator {

	public int compare(Object obj1, Object obj2) {
		if (obj1 instanceof Student && obj2 instanceof Student) {
			Student s1 = (Student) obj1;
			Student s2 = (Student) obj2;

			// return s1.name.compareTo(s2.name);
			return s1.sid - s2.sid;

		}
		return 0;

	}
}
