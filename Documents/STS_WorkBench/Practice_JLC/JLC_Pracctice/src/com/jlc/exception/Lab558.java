package com.jlc.exception;

public class Lab558 {

	public static void main(String[] args) {
		int r = new Hello().show();
		System.out.println("main: " + r);

	}

}

class Hello {
	int show() {
		int a = 0;
		try {
			System.out.println("Try block begins: " + a);
			a = 10 / 2;
			System.out.println("Try block ends: " + a);
			return a;
		} catch (ArithmeticException ae) {
			a = 20;
			System.out.println("Catch block: " + a);
			return a;
		} finally {
			System.out.println("Finally block: " + a);
			int arr[] = new int[1];

		}
	}
}