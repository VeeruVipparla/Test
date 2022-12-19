package com.jlc.collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lab666 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Bahubali");
		list.add("Sahoo");
		list.add("Salar");
		list.add("Chatrapthi");
		list.add("Darling");
		list.add("MR.perfect");
		System.out.println("\n Sorting in Ascending order");
		// Collections.sort(list);
		Collections.sort(list, new StringAcending());
		System.out.println(list);

		System.out.println("\n Sorting in Decending Order");
		Collections.sort(list, new StringDescComp());
		System.out.println(list);

	}

}

class StringDescComp implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();

		return -s1.compareTo(s2);
		// return s2.compareTo(s1);
	}

}

class StringAcending implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s1.compareTo(s2);
	}

}