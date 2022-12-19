package com.notebookpractice;

public class StringCompression {

	public static void main(String[] args) {
		String input="aaabbccd";
		int count=0;
		char temp=input.charAt(0);
		
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==temp)
				count++;
			else {
			 System.out.println(temp+"-"+count+"time(s)");
				count=1;
				temp=input.charAt(i);
			}
		}
		System.out.println(temp+"-"+count+"time(s)");
	}
}
/*
public class ConvertNumericToChar {
static void convertNumToChar(String s) {
	for (int i = 0; i < s.length(); i++) {
		if (Character.isAlphabetic(s.charAt(i))) {
			System.out.print(s.charAt(i));
		} else {
			int a = Character.getNumericValue(s.charAt(i));
			for (int j = 1; j < a; j++) {
				System.out.print(s.charAt(i - 1));
			}}}}
public static void main(String[] args) {
	String str = "a3b2c2d1";
	convertNumToChar(str);
}
}
==========
public String toFormat(String input) {
	char inChar[] = input.toCharArray();
	String output = "";
	int i;
	for (i = 0; i < input.length(); i++) {
		int count = 1;

		while (i + 1 < input.length() && inChar[i] == inChar[i + 1]) {
			count += 1;
			i += 1;
		}
		output += inChar[i] + String.valueOf(count);
	}
	return output;
}
public static void main(String[] args) {
	StringCompression sol = new StringCompression();
	String input = "aaabbccd";
	System.out.println("Formatted String is:" + sol.toFormat(input));
}
}

============

*/