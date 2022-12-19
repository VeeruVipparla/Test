package com.java.pract_progrms;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharactersInString {
	static void duplicateCharCount(String inputString) {
		// creating a HashMap char as a Key and occurrence is value
		HashMap<Character, Integer> charCountMap = new HashMap<>();

		// converting given string to charArray
		char[] strArray = inputString.toCharArray();
		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				// If char is present in charCountMap, incrementing it's count by 1
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				// If char is not present in charCountMap,
				// putting this char to charCountMap with 1 as it's value
				charCountMap.put(c, 1);
			}
		}
		// Getting a Set containing all keys of charCountMap
		Set<Character> charInString = charCountMap.keySet();
		System.out.println("Duplicate Characters In ::" + inputString);
		// Iterating through Set 'charInString'
		for (Character ch : charInString) {
			if (charCountMap.get(ch) > 1) {
				// if any char has a count of more than 1, printing its Count
				System.out.println(ch + "::" + charCountMap.get(ch));
			}
		}
	}

	public static void main(String[] args) {
		duplicateCharCount("JavaJ2EE");
	}

}
