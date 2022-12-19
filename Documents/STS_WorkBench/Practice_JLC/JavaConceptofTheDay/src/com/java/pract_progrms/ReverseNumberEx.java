package com.java.pract_progrms;

public class ReverseNumberEx {

	public static void main(String[] args) {
		int number = 12345;
		int reverse = 0;

		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;

			System.out.println(reverse);
		}
		System.out.println("====");
		System.out.println(reverse);
		System.out.println("forLoop reverse Number");
		
		int number1=6789;
		int reverse1=0;
		
		for (;number1 !=0; number1=number1/10) {
			int remainder1=number1%10;
			reverse1=reverse1*10+remainder1;
		}
	System.out.println(reverse1);
	}

}
