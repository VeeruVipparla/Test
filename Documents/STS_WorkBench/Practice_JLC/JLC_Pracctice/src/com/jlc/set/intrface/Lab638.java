package com.jlc.set.intrface;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Lab638 {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new StringDescComparator());
		ts.add("Farmer");
		ts.add("Driver");
		ts.add("Doctor");
		ts.add("Actor");
		ts.add("Manager");
		
		Iterator it=ts.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	}

}

class StringDescComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		if (obj1 instanceof String && obj2 instanceof String) {
			String s1 = (String) obj1;
			String s2 = (String) obj2;
			return s2.compareTo(s1);  //Desc
			 //return s1.compareTo(s2);  //sAsc
		}
		return 0;
	}
}