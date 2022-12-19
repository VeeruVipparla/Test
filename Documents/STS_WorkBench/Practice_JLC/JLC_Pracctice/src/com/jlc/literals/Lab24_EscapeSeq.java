package com.jlc.literals;

public class Lab24_EscapeSeq {
//Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
	public static void main(String[] args) {
		char ch1='\\';
		char ch2='\"';
		char ch3='\b';
		char ch4='\"';
		String str = "welcome to\\JLC\\";
		String str1="Hi this is"+"VEERU";
		char ch5='\u';//Invalid unicode
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(str);

	}

}
