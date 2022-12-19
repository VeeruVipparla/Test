package com.practiceprograms;

public class WordCountEX {
	public static void main(String args[]) {
		String str = "My name is Veeru";
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
