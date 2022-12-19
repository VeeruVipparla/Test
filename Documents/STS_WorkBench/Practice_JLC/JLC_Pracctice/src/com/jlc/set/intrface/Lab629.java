package com.jlc.set.intrface;

import java.util.TreeSet;

public class Lab629 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(11);
		ts.add(43);
		ts.add(23);
		ts.add(13);
		ts.add(41);
		ts.add(78);
		ts.add(54);
		ts.add(65);
		ts.add(90);
		ts.add(90);
		ts.add(0);
		ts.add(12);
		// ts.add(null);
		System.out.println(ts);
		System.out.println("=========");
		System.out.println("===subset()====");

		System.out.println(ts.subSet(23, 43));
		System.out.println(ts.subSet(13, false, 90, false));
		System.out.println(ts.subSet(13, true, 90, true));
		System.out.println(ts.subSet(13, true, 90, false));
		System.out.println(ts.subSet(13, false, 90, true));
		System.out.println("===headSet()====");
		System.out.println(ts.headSet(23));
		System.out.println(ts.headSet(23, true));
		System.out.println("====TreeSet()====");
		System.out.println(ts.tailSet(65));
		System.out.println(ts.tailSet(65, false));
		System.out.println(ts.tailSet(65, true));
		System.out.println(ts);
		System.out.println("===pollFirst()====");
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		System.out.println("===Lower()====");
		System.out.println(ts.lower(11));
		System.out.println(ts.lower(23));
		System.out.println(ts.lower(15));
		System.out.println("====higher()===");
		System.out.println(ts.higher(11));
		System.out.println(ts.higher(90));
		System.out.println("===ceiling===");
		//Returns the least element in this set greater than or equal to the given element, 
		//or null if there is no such element.
		System.out.println(ts.ceiling(11));
		System.out.println(ts.ceiling(78));
		System.out.println(ts.ceiling(90));
		System.out.println(ts.ceiling(100));
		System.out.println("===Floor()===");
		//Returns the greatest  element in this set greater than or equal to the given element, 
		//or null if there is no such element.
		System.out.println(ts.floor(13));
		System.out.println(ts.floor(100));
		
		
	}

}
