package com.jlc.operators;

public class Lab65_Arthmtic_Oprtrs {

	public static void main(String[] args) {
		//cannot convert from int to byte
		byte a=19;
		int b=a--;
		int c=-a;
		char ch1='a';
		int ch2=+ch1;
		double d1=1234.567;
		double d2=d1++;
		double d3=++d1;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);

	}

}
