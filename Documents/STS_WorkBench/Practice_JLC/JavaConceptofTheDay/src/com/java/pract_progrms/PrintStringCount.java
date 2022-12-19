package com.java.pract_progrms;

import java.util.HashMap;

public class PrintStringCount {

	private static void StringCount(String str) {

		char[] string = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : string) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		StringCount("javaj2ee");

	}

}
