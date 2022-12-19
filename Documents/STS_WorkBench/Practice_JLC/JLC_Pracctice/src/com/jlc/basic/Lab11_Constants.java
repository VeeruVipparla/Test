package com.jlc.basic;

public class Lab11_Constants {

	public static void main(String[] args) {

		final int A = 11;
		final int B;
		System.out.println(A);
//		System.out.println(B);//The local variable B may not have been initialized
//		A = 22; // The final local variable A cannot be assigned.
		System.out.println(A); // It must be blank and not using a compound assignment

		int a = 99;
		System.out.println(a);

		a = 88;
		System.out.println(a);
		
		
		final int C;
		C=33;
		System.out.println(C);
//		C=44;//The final local variable C may already have been assigned
		System.out.println(C);
		
		/*
		 * const int b=99; //token "const", delete this token
		 * 
		 * System.out.println(b);
		 */
		
		final int A1=10;
		System.out.println(A1);
		int B1=10;
		System.out.println("Final value of"+ (A1+B1)+"\t"+A1+B1);
	}

}
