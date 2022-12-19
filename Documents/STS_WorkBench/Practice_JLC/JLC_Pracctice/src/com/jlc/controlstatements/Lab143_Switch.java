package com.jlc.controlstatements;

public class Lab143_Switch {

	public static void main(String[] args) {
		int a = 7;
		switch (a) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Wrong input");
			System.out.println("==============");
			System.out.println();

		}
		int a1 = 30;
		switch (a1) {
		case 30:
			System.out.println("30");
			System.out.println("==============");
			break;
		}
		char ch = 'A';
		switch (ch) {
		}
		byte by = 123;
		switch (by) {
		}
		short sh = 234;
		switch (sh) {
		}

	}

}
