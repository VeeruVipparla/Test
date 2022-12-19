package com.jlc.set.intrface;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Lab635_Comparator {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new SidComparator());
		// HashSet ts=new HashSet();
		ts.add(new Student4(100, "Veeru"));
		ts.add(new Student4(200, "Rama"));
		ts.add(new Student4(66, "Raju"));
		ts.add(new Student4(160, "Veeru"));
		ts.add(new Student4(900, "Ravi"));
		ts.add(new Student4(46, "Kalyan"));
		ts.add(new Student4(46, "Kalyan"));

		System.out.println(ts);
		Iterator it = ts.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}

class Student4 {
	int sid;
	String sname;

	Student4(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;
	}

	public String toString() {
		return "Student4 [" + "sid::-" + sid + ", sname::-" + sname + "]";

	}

}

class SidComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		if (obj1 instanceof Student4 && obj2 instanceof Student4) {
			Student4 s1 = (Student4) obj1;
			Student4 s2 = (Student4) obj2;
			// return s1.sid - s2.sid;
			return s1.sname.compareTo(s2.sname);
		}
		return 0;
	}

}
