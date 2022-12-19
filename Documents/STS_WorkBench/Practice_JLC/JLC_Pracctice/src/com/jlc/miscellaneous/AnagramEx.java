package com.jlc.miscellaneous;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first string::");
		String firstString = scanner.next();// next::-the next token
		System.out.println("Enter second string::");
		String secondString = scanner.next();//  nextLine::-the line that was skipped

		// converting both String to lowercase
		// firstString = firstString.toLowerCase();
		// secondString = secondString.toLowerCase();

		// converting String to char Array
		char[] charArrayFirstString = firstString.toLowerCase().toCharArray();
		char[] charArraySecondString = secondString.toLowerCase().toCharArray();

		// sorting both thr arrays
		Arrays.sort(charArrayFirstString);
		Arrays.sort(charArraySecondString);

		// checking both arrays are equal or not
		// if arrays are equal then string are anagram otherwise not

		boolean isAnagram  = Arrays.equals(charArrayFirstString, charArraySecondString);
		
		if (isAnagram) {
			System.out.println(firstString + "-and-" + secondString + "::are anagrams");
		} else {
			System.out.println(firstString + "-and-" + secondString + "::not are anagrams");
		}

	}

}
