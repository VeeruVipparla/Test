package com.jlc.operators;

public class Lab99_CompoundAss_OP {

	public static void main(String[] args) {
		int a=10;
		a*=3+4;
		System.out.println(a);
		a+=9;
		System.out.println(a);
		
		byte b=9;
		System.out.println(b*b*3+4);
//		b=b*3+4;// b=b*b*3+4 cannot convert from int to byte
		b*=b*3+4;
		System.out.println("b value is :: "+b);
		int c=10;
		c=c*(3+4);
		System.out.println(c);
		

		
		

	}
}