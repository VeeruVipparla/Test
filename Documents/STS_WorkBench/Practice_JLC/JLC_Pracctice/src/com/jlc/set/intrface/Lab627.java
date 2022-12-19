package com.jlc.set.intrface;

import java.util.HashSet;

public class Lab627 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(new Student1(99));
		hs.add(new Student1(99));
		hs.add(new Student1(99));
		hs.add(new Student1(99));
		
		Object obj[]=hs.toArray();
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		
		System.out.println(hs);
	}
}

class Student1 {
	int sid;

	public Student1(int sid) {
		this.sid = sid;
	}

	public String toString() {
		return "Student1 [sid=" + sid + "]";
	}

/*	public int hashcode() {
		System.out.println("Hashcode");
		return sid;

	}*/

/*	public boolean equals(Object obj) {
		System.out.println("Equals()");
		if (obj instanceof Student1) {
			Student st = (Student) obj;
			return this.sid == st.sid;
		}
		return false;

	}*/
}