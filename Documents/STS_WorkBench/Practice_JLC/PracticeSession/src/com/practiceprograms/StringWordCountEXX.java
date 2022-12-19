package com.practiceprograms;

import java.util.HashMap;
import java.util.Set;

public class StringWordCountEXX {
	public static void charCount(String str) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] s1 = str.toCharArray();
		for (char c : s1) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		Set<Character> set=map.keySet();
		for(Character c1: set) {
			System.out.println(c1+"::"+map.get(c1));
/*			
			if(map.get(c1)>1) {
				System.out.println(c1+"::"+map.get(c1));
			}
*/			
		}
	}

	public static void main(String args[]) {
		charCount("javaj2EE");

	}
}