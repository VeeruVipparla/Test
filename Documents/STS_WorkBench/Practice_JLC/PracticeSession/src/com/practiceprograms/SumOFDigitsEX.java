package com.practiceprograms;

public class SumOFDigitsEX {

	public static void main(String args[]) {
		int copyNumber = 12345;
		int sum = 0;
		while (copyNumber != 0) {
			int lastDigit = copyNumber % 10;
			sum += lastDigit;
			copyNumber = copyNumber / 10;
		}
		System.out.println(sum);
	}

}
