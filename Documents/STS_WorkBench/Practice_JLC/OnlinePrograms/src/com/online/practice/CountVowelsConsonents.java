package com.online.practice;

public class CountVowelsConsonents {

	public static void main(String[] args) {
		String s2 = "a";
		s2.charAt(0);
		System.out.println(s2);

		String str = "India Is My Country";
		String s = str.toLowerCase();
		int vCount = 0, cCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				vCount++;
			}

			else {
				if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
					cCount++;
				}
			}
		}
		System.out.println("Count No Of Vowels::" + vCount);
		System.out.println("Count No Of Consonants::" + cCount);

	}
}
