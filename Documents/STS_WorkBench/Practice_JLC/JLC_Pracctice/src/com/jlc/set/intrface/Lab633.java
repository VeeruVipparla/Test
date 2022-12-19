package com.jlc.set.intrface;

import java.util.Iterator;
import java.util.TreeSet;

public class Lab633 {

	public static void main(String[] args) {
		System.out.println("Student Info");
		TreeSet ts = new TreeSet();
		ts.add(new Student3(100, "Sri"));
		ts.add(new Student3(200, "Veeru"));
		ts.add(new Student3(300, "Rama"));
		System.out.println(ts);
		Iterator it = ts.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

}

class Student3 implements Comparable {//
	int sid;
	String sname;

	Student3(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;
	}

	public int compareTo(Object obj) {
		if (obj instanceof Student3) {
			Student3 st = (Student3) obj;
			return this.sid - st.sid;

		}
		return 0;

	}

	@Override
	public String toString() {
		return +sid + "\t" + sname;
	}

}
