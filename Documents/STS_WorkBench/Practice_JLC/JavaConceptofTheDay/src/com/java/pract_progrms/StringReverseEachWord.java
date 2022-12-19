package com.java.pract_progrms;

public class StringReverseEachWord {
	public static void reverseWordString(String str) {
		String[] word = str.split(" ");
		String reverseWord = "";
		for (String w : word) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseWord  +=sb.toString()+" ";
			
		}
		System.out.println(str);
		System.out.println(reverseWord);

	}

	public static void main(String args[]) {
		reverseWordString("java Apllication");
	}
}