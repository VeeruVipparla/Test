package com.java.pract_progrms;

import java.util.Scanner;

public class WhiteSpacesRemove {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input String to be cleaned from whiteSpace");
		String inputString = sc.nextLine();
		char[] charArray=inputString.toCharArray();
		String stringWithoutSpaces=" ";
		for (int i = 0; i < charArray.length; i++) {
			if((charArray[i]!=' ')&& (charArray[i]!='\t')) {
		
			stringWithoutSpaces =stringWithoutSpaces+charArray[i];
			}
		}
		System.out.println("InputString ::"+inputString);
		System.out.println("inputString Without Space:;"+stringWithoutSpaces);
		sc.close();
		
	}


}
