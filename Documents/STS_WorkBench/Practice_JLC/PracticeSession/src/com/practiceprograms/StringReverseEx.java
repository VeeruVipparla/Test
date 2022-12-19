package com.practiceprograms;

public class StringReverseEx {

	public static void main(String[] args) {
		String s1 = "How to do in java";
		StringBuilder r1 = new StringBuilder();
		String[] s2 = s1.split(" ");
		for (String w : s2) {
			String r2 = new StringBuilder(w).reverse().toString();
			r1.append(r2 + " ");
		}
		System.out.println(r1.toString().trim());
	}

}
