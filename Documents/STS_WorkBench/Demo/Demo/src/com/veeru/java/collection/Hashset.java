package com.veeru.java.collection;

import java.util.HashSet;

class Hashset {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		hs.add("veeru");
		hs.add(10);
		hs.add(32.33f);
		hs.add(32.87d);
		hs.add(null);
		// hs.add("veeru");

		System.out.println("How many objects are store HS:: " + hs);
		System.out.println("Size" + hs.size());
		System.out.println("contains ()" + hs.contains("veeru"));
		System.out.println("remove(Veeru) " + hs.remove("veeru"));
		System.out.println("Size " + hs.size());
		System.out.println("How many objects are store HS::" + hs);

		/* System.out.println(hs.clone()); */
		System.out.println("isEmpty() " + hs.isEmpty());//false
		
		hs.clear();
		System.out.println("isEmpty()" + hs.isEmpty());//true
		System.out.println("How many objects are store HS::" + hs);

	}
}