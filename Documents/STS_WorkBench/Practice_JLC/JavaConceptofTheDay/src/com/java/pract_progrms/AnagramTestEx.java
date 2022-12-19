package com.java.pract_progrms;

import java.util.Arrays;

public class AnagramTestEx {

	static void isAnagram(String str1, String str2) {
		// removing the spaces..
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		// initially setting status as true
		boolean status = true; 
		if (s1.length() != s2.length()) {
			status = false;
		} else {
			char[] s1Array = s1.toLowerCase().toCharArray();
			char[] s2Array = s2.toLowerCase().toCharArray();
			// sorting the arrays
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);

			status = Arrays.equals(s1Array, s2Array);
		}
		if (status) {
			System.out.println(str1 + " and " + str2 + " are anagrams");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams ");
		}
	}

	public static void main(String[] args) {
		isAnagram("Mother", "Father");
		isAnagram(" veeru", "Veeru");

	}

}
