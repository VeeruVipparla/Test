package com.java.pract_progrms;

public class SumTheDigits {

	private static void sumOfAllDigits(int inputNumber) {
		// copy of the inputNumber
		int copyOfInputNumber = inputNumber;
		
		// initializing the sum 0
		int sum = 0;
		while (copyOfInputNumber != 0) {
			// Getting the lastDigit of the inputNumber
			int lastDigit = copyOfInputNumber % 10;
			// Adding the Last Digit the Sum
			sum = sum + lastDigit;
			// removing the lastDigit from the inputNumbr
			copyOfInputNumber = copyOfInputNumber / 10;
		}
		// print sum
		System.out.println("Sum of the All the Digits " + inputNumber + "=" + sum);

	}

	public static void main(String as[]) {
		sumOfAllDigits(12345);
	}

}
