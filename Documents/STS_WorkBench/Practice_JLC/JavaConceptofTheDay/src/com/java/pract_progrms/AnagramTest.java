package com.java.pract_progrms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First String ");
		String string1 = sc.nextLine();
		System.out.println("Enter your Second String ");
		String string2 = sc.nextLine();
//		String stringOne= string1.replaceAll("\\s", " ");
//		String stringTwo= string2.replaceAll("\\s", " ");

		char[] strChar1 = string1.toLowerCase().toCharArray();
		char[] strChar2 = string2.toLowerCase().toCharArray();
		// sorting the Arrays
		Arrays.sort(strChar1);
		Arrays.sort(strChar2);

		// compare the Arrays
		boolean isAnagram = Arrays.equals(strChar1, strChar2);

		if (isAnagram) {
			System.out.println(string1 + " and " + string2 + " are anagrams");
		} else {
			System.out.println(string1 + " and " + string2 + " are not anagrams");
		}

	}

}
