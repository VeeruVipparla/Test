package com.jlc.exception;

public class Lab549 {
public static void main (String []args) {
	try {
	int res=10/0;
	System.out.println("result:: "+res);

	}catch(NumberFormatException |ArithmeticException | ArrayIndexOutOfBoundsException ae) {
		System.out.println("invalid input");
	}catch (Exception e) {
		System.out.println("Give valid input");
	}
}
}
