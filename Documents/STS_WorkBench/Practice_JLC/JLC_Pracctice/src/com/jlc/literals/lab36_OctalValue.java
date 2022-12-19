package com.jlc.literals;

//Octal range Decimal--0 to 255 and in Octal--\0 to \377  
//DDD d means Octal digit
public class lab36_OctalValue {

	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = 65;
		System.out.println(ch1);
		System.out.println(ch2);

		char ch3 = '\u0041';
		char ch4 = '\101';
		char ch5 = '\103';
		char ch6= '\420';//Invalid character constant
		

		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch6);
		

	}

}
