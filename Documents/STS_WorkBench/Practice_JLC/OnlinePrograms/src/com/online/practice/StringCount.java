package com.online.practice;

public class StringCount {

	private static int factorial(int number) {
		if (number == 0) {
			return 1;
		} else {
			return number * factorial(number - 1);
		}

	}

	public static void main(String[] args) {
		int fact = 1;
		int number = 4;
		System.out.println(factorial(number));

	}

}
