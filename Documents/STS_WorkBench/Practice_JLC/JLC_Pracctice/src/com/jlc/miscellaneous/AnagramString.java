package com.jlc.miscellaneous;

import java.util.Arrays;

public class AnagramString {
	static void isAnagram(String str1, String str2) {
		String s1 = str1.replaceAll("", "");
		String s2 = str2.replaceAll("", "");

		boolean status = true;

		if (s1.length() != s2.length()) {
			status = false;

		} else {
			
			String firstString =s1.toLowerCase();
			String secondString=s2.toLowerCase();
			char[] ArrayS1 =firstString.toCharArray();
			char[] ArrayS2 =secondString.toCharArray();
			
			//char[] ArrayS1 = s1.toLowerCase().toCharArray();
			//char[] ArrayS2 = s2.toLowerCase().toCharArray();

			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);

			status = Arrays.equals(ArrayS1, ArrayS2);
		}

		if (status) {
			System.out.println(s1 + "--and--" + s2 + " are anagrams");

		} else {
			System.out.println(s1 + "--and--" + s2 + " are not anagrams");

		}

	}

	public static void main(String[] args) {
		isAnagram("veeru", "VEERU");
		isAnagram("MOTHER", "BROTHER");
	}

}
