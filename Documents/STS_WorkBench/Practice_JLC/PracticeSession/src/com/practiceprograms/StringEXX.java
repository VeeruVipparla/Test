package com.practiceprograms;

public class StringEXX {

	public static void main(String[] args) {
		String s=" v";
		String s1="Veeru";
		String s2="Veeru";
		String s3=new String("Veeru");
		String s4=new String("Veeru");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s3));
	 	System.out.println(s1==s3);
	 	System.out.println(s3==s4);
	    System.out.println(s1.intern()==s3.intern());
	    System.out.println(s1.intern().equals(s3));
	    
	}

}
