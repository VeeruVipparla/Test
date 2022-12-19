package com.practiceprograms;

public class SwapEx {

	public static void main(String[] args) {
		int firstNumber=12;
		int secondNumber=20;
		
		System.out.println("before Swapping");
		System.out.println("firstNumber "+firstNumber);
		System.out.println("secondNumber "+secondNumber);
/*
		int temp=firstNumber;
		firstNumber=secondNumber;
		secondNumber=temp;
*/
		firstNumber=firstNumber-secondNumber;
		secondNumber=secondNumber+firstNumber;
		firstNumber=secondNumber-firstNumber;
		
		System.out.println("After Swapping");
		System.out.println("firstNumber "+firstNumber);
		System.out.println("secondNumber "+secondNumber);
		
	}

}
