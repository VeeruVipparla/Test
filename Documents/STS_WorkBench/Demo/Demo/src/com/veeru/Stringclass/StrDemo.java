package com.veeru.Stringclass;

import com.sun.org.apache.xerces.internal.dom.AttrImpl;

// create Strings and how to use some important methods by using String class

class StrDemo {
	public static void main(String[] args) {
		String s1 = " A book on java";
		String s2 = new String("I like it");
		char arr[] = { 'v', 'e', 'e', 'r', 'u', 'v', 'i', 'p', 'p', 'a', 'r', 'l', 'a' };
		String s3 = new String(arr);
String s4= new String("  ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println("Length of the s1=" + s1.length());// length of the first String

		System.out.println("s1 and s2 joined=" + s1.concat(s2));// concatenate S1 and S2

		System.out.println(s1 + " from" + s3);// concatenate S1 and S3

		// test if Strings s1 starts with A

		boolean x = s1.startsWith("A");
		if (x)
			System.out.println("s1 starts with \'A\'");
		else
			System.out.println("s1 does not start with\'A\'");

		// Extract substring from s2, starting from 0th char to 6th char

		String p = s3.substring(0, 7);

		// Extract substring from s2, starting from 0th char to 8th char

		String q = s3.substring(0, 9);

		// concatenate the Strings p and q

		System.out.println(p + q);

		// convert s1 into UpperCase and LowerCase

		System.out.println("upper s1=" + s1.toUpperCase());
		System.out.println("lower s1=" + s1.toLowerCase());
        
		System.out.println("Trim::"+s1.trim());
        
        System.out.println("Intern::"+ s4.intern());
        System.out.println("Replace::"+p.replaceAll(p, q));
        System.out.println("Containes::"+ s1.contains("Veeru")); 
	}

}