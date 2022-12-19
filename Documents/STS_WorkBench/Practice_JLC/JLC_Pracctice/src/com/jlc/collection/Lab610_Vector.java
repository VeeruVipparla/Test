package com.jlc.collection;

import java.util.Enumeration;
import java.util.Vector;

public class Lab610_Vector {

	public static void main(String[] args) {
		Vector vec = new Vector();
		vec.add("Kohli");
		vec.add("Dhoni");
		vec.add("Rohit");
		System.out.println(vec);
		Enumeration enu = vec.elements();
		
		System.out.println(enu.nextElement());// java.util.NoSuchElementException: Vector Enumeration
		
		System.out.println("Main method");

	}

}
