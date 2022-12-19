package com.jlc.operators;

public class Lab72_BinaryArth {

	public static void main(String[] args) {
		final int a = 123;
		byte b = a;
		final byte b1 = 90;
		final byte b2 = 9;
		byte b3 = b1 + b2;
		final byte c=12;
		long b4=c;
		System.out.println(a);
		System.out.println(b);
		System.out.println("=====================");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println("==================");
		System.out.println(c);
		System.out.println(b4);
		System.out.println("====================");
		System.out.println(20/3);
		System.out.println(20/3.0f);
		System.out.println(20/3.0);
		System.out.println("====================");
		System.out.println(20/0.0);
		System.out.println(20/-0.0);
		System.out.println(-20/0.0);
		System.out.println("=================");
		System.out.println(0/0.0);
		
		double d1=0/0.0;
		System.out.println(d1);
		System.out.println("=================");
		//System.out.println(12/0);// java.lang.ArithmeticException: / by zero
		//System.out.println(0/0);
		System.out.println("=======================");
		int a1=90;
		int a2=9;
		int a3=a1+a2-10;
		int a4=a1-a2+10;
		System.out.println(a3);
		System.out.println(a4);
		
		System.out.println("===================");
		
		int c1=10;
		int c2=20;
		int c3=4;
		int c4=c1*c2*c3;
		int c5=(c1+c2)*c3;
		System.out.println(c4);
		System.out.println(c5);
		
		System.out.println("==================");
		
		int e1=40;
		int e2=16;
		int e3=4;
		int e4=e1-e2/e3;
		int e5=(e1-e2)/e3;
		
		System.out.println(e4);
		System.out.println(e5);
		
		
		
		


	}

}
