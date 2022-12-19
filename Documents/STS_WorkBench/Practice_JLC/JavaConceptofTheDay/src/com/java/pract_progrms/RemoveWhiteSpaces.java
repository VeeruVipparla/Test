package com.java.pract_progrms;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter input String to be cleaned from white spaces");
	String inputString =sc.nextLine();
	String  stringWithOutSpaces=inputString.replaceAll("\\s", "");
	System.out.println("InputString::-"+inputString);
	System.out.println("InputString Without Spaces::-"+stringWithOutSpaces);
	sc.close();
	
	
		
	}

}
