package com.jlc.exception;

public class Lab560 {

	public static void main(String[] args) {
		System.out.println("Main Started");
	new Hello1().show("2");
	System.out.println("Main Completed");

	}

}
class Hello1{
	void show(String str) {
		System.out.println("Main Started");
		try {
			System.out.println("try block started");
			int a=Integer.parseInt(str);
			int b=10/a;
			System.out.println("Try block completed: "+b);
			
		}catch (ArithmeticException ae) {
			System.out.println("catch block");
			System.exit(0);
		}finally {
			System.out.println("finally block");
		}
	}
}