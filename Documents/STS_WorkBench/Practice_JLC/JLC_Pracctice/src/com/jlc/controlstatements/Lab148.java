package com.jlc.controlstatements;

public class Lab148 {

	public static void main(String[] args) {
		byte b = 20;
		switch (b) {
		case 10:
			System.out.println("TEN");
		case 18:
			System.out.println("One Twenty Eight");

		}
		System.out.println("=====================");
		int a = 10;
		final int x = 20;
		switch (a) {
		case 10:
			System.out.println("Ten");
			
		case x:
			System.out.println("Twenty");
			break;
		case 'A':
			System.out.println("CHAR-A");
			break;
		case 10 + 20 + 15:
			System.out.println("Constant Expr");
			break;
		default:
			System.out.println("Default");

		}
	}
}
