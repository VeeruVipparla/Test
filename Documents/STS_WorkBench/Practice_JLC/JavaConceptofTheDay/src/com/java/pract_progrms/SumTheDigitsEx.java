package com.java.pract_progrms;

public class SumTheDigitsEx {

	private static void sumOfAllDigits(long inputNumber) {
		long copyNumber = inputNumber;
		long sum = 0;
		while (copyNumber != 0) {
			long number = copyNumber % 10;
			sum = sum + number;
			copyNumber = copyNumber / 10;

		}
		System.out.println("sum Of All Digits::" + inputNumber + "=" + sum);
	}
	
	public static void main(String[] args) {
		sumOfAllDigits(8867076116L);

	}

}
