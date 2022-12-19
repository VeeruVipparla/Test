package com.veeru.Stringclass;
//a program to compare two string using '==' operator, and see the result
public class Strcompare {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Veeru";
		String s3= new String("Veeru");//it's not store Connection pool , 
		//It's creating out But same reference as given.
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		 //if (s1==s2)
		if (s1.equals(s3) || s3.equals(s2))
		//if (s3.equals(s2))
			
		System.out.println("Both are same");
		 
		else System.out.println("Not same");
			

	}

}
