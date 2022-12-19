package com.jlc.string;

public class Lab498 {

	public static void main(String[] args) {
		String str="^[A-Za-z0-9]*";
		/*String i = "[0-9]*";
		String exp="[A-z]*";
		System.out.println("H".matches(exp));
		System.out.println("Y".matches(exp));
		System.out.println("HI".matches(exp));
		System.out.println("0".matches(i));*/
		
		System.out.println("Hihow".matches(str));
		System.out.println("Veeru12".matches(str));
		System.out.println("ju88".matches(str));
		System.out.println("089Veeru@".matches(str));
		
	}

}
