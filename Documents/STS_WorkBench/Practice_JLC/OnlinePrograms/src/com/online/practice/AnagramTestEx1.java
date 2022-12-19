package com.online.practice;

import java.util.Arrays;

public class AnagramTestEx1 {
	public static void isAnagram(String str1, String str2) {
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		boolean status;
		/*
		 * if (s1.length() != s2.length()) { status = false; } else {
		 */
		char[] s1Array = s1.toLowerCase().toCharArray();
		char[] s2Array = s2.toLowerCase().toCharArray();

		Arrays.sort(s1Array);
		Arrays.sort(s2Array);

		status = Arrays.equals(s1Array, s2Array);
		if (status) {
			System.out.println(str1 + " and " + str2 + " is anagrams");
		} else {
			System.out.println(str1 + " and " + str2 + " is not anagrams");
		}

	}

	public static void main(String[] args) {
		isAnagram("Veeru", "Veera");
		isAnagram("Brave", "brave");

	}

}
