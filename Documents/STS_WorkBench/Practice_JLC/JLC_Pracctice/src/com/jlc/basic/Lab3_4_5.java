package com.jlc.basic;

public class Lab3_4_5 {
	int b = 4;
	static int a1 = 2;
	

	public static void main(String[] args) {
		int a = 6;// The local variable a may not have been initialized
		System.out.println(b);// Cannot make a static reference to the non-static field b
		System.out.println(a1);
		System.out.println(a);
	}

}
