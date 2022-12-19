package com.jlc.set.intrface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Lab621 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Capgemini");
		hs.add("Cognozent");
		hs.add("Accenture");
		hs.add("Dell");
		hs.add("Wipro");
		
		System.out.println(hs);

		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Capgemini");
		lhs.add("Cognozent");
		lhs.add("Accenture");
		lhs.add("Dell");
		lhs.add("Wipro");

		System.out.println(lhs);

		TreeSet ts = new TreeSet();
		ts.add("Capgemini");
		ts.add("Cognozent");
		ts.add("Accenture");
		ts.add("Dell");
		ts.add("Wipro");

		System.out.println(ts);

		System.out.println("==============");
		LinkedHashSet lhs1 = new LinkedHashSet(hs);
		TreeSet ts1 = new TreeSet(lhs);

		System.out.println(lhs1);

		System.out.println(ts1);
		
		System.out.println("=============Another Example=============");
		
		
		LinkedHashSet lhs2 = new LinkedHashSet();
		lhs2.add(new Long(65));
		lhs2.add(new Byte((byte) 65));
		lhs2.add(new Integer(65));
		lhs2.add ("A");
		
		System.out.println(lhs2);
		
		
		
		
	}

}
