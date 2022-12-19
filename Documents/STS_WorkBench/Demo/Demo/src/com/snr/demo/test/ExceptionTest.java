package com.snr.demo.test;

public class ExceptionTest {
	
	public static void main(String[] args) {
		
	try {
		System.out.println("Open files");
		int n=args.length;
		System.out.println("n value ::"+n);
		int a=45/n;
		System.out.println("a value ::"+a);
		
		
	} catch (ArithmeticException ae) {
		System.out.println(ae);
		
	}
	finally {
		System.out.println("Close files");
	}
		
		
		
		
	}

}
