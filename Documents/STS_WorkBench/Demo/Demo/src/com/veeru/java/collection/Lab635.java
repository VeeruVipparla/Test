package com.veeru.java.collection;

import java.util.Iterator;
import java.util.TreeSet;



public class Lab635 {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet(new NameComarator());
		ts.add(new Student(99, "Sri"));
		ts.add(new Student(100, "Veera"));
		ts.add(new Student(111, "Rama"));
		ts.add(new Student(01, "Raju"));
		Iterator it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
