package com.collection.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s= new HashSet();
		s.add(10);
		s.add(20);
		s.add("Veeru");
		s.add(12.23f);
		s.add(22.03d);
		s.add('v');
		s.remove(20);
		System.out.println(s);
		
		for (Object o : s) {
			System.out.println(o);
			
		}

	}

}
