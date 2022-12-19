package com.jlc.exception;

public class lab555 {

	public static void main(String[] args) {
		try {

			int res = 10 / 3;
			System.out.println("result:: " + res);
			return;

		} catch (NumberFormatException ne) {
			System.out.println("invalid output");
		} catch (Exception e) {
			System.out.println("not a Exception");
		} 
			System.out.println("finally block");
		

	}
}