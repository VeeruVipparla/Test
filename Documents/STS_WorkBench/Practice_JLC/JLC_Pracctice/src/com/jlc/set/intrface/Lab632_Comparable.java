package com.jlc.set.intrface;

import java.util.Iterator;
import java.util.TreeSet;

public class Lab632_Comparable {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new Employee(100, "Sri"));// "Sri"
		ts.add(new Employee(200, "Veeru"));
		ts.add(new Employee(300, "veera"));
		System.out.println(ts);
		 
		Iterator it=ts.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}

class Employee implements Comparable {
	int eid;
	String ename;

	public Employee(int eid, String ename) {

		this.eid = eid;
		this.ename = ename;
	}

	@Override
	public int compareTo(Object obj) {
		if (obj instanceof Employee) {
			Employee em = (Employee) obj;
			return this.ename.compareTo(em.ename);
		}

		return 0;
	}

	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}

}