package com.jlc.miscellaneous;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<Object> ts=new TreeSet<>();
		ts.add(11);
		ts.add(22);
		ts.add(0);
		ts.add(14);
		ts.add(55);
		ts.add(22);
		ts.add(0);
//		ts.add("veeru");
//		ts.add(null);//java.lang.NullPointerException
		
		System.out.println(ts);
		System.out.println(ts.isEmpty());
		
		
	}

}
