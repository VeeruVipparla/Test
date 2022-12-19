package com.java.pract_progrms;

public class ReverseStringNumber {

	public static void main(String[] args) {
		String str = "123456";

		char[] charNumber = str.toCharArray();

		for (int i = charNumber.length - 1; i >= 0; i--) {

			System.out.print(charNumber[i]);

			if (i == 0) {
				break;
			}

			System.out.print(" ,");

		}

	}

}
