package com.java.pract_progrms;

public class StringEachWordReverse {
	public static void stringWordReverse(String str) {
		String[] words = str.split(" ");
		String reverseString = "";
		String reverseWord = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord += word.charAt(j);
			}
			reverseString += reverseWord + " ";
		}
		System.out.println(str);
		System.out.println(reverseString);
	}

	public static void main(String[] args) {
		stringWordReverse("India Is My Country");

	}

}
