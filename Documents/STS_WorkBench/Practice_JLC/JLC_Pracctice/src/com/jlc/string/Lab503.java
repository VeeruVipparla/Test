
package com.jlc.string;

public class Lab503 {
	public static void main (String as[]) {
		String s="Veeru Vipparla";
		String s1="Vipparla NarasimhaRao";
		String s2="NarasimhaRao Vipparla"; 
		System.out.println();
		boolean b1=s.regionMatches(6, s1, 0, 8);
		System.out.println(b1);
		boolean b2=s1.regionMatches(0, s2, 13, 8);
		System.out.println(b2);
		boolean b3=s.regionMatches(6, s2, 2, 5);
		System.out.println(b3);
	}

}
