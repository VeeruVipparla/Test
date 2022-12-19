package com.practiceprograms;

public class Hello {
	private static void isPalandrome(String s1) {
	String rev="";
		for(int i=s1.length()-1; i>=0; i--) {
		
			rev +=s1.charAt(i);
			
		}
		if(s1.equals(rev)) {
			System.out.println("Is pal");
		}else {
			System.out.println("not");
		}
	}
public static void main(String[] args) {
	
	isPalandrome("madam");
	
	
}
}
