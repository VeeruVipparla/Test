package com.veeru.java.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Lab633 {

	public static void main(String[] args) {
	System.out.println("STUDENT INFO");
	 TreeSet ts= new TreeSet ();
	 ts.add(new StudentOne(99, "Sri"));
	 ts.add(new StudentOne(100, "Veera"));
	 ts.add(new StudentOne(111, "Rama"));
	 ts.add(new StudentOne(01, "Raju"));
	 Iterator it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
	}

}
}