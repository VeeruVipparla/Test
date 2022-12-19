package com.jlc.literals;

public class Lab60_UnderScoreLit {

	public static void main(String[] args) {
		int _12=9898;
		System.out.println(_12);

		int a=_12;
		System.out.println(a);

		// b=_234;// _234 cannot be resolved to a variable
//		int c=0b_101;//Underscores have to be located within digits
		//double d1=123._ 45;
		double d2=1_23_3.4_87;
		//int a=0_1_a_f;//Underscores have to be located within digits
		int i=0_100;
		
		System.out.println(d2);
		System.out.println(i);
	}

}
