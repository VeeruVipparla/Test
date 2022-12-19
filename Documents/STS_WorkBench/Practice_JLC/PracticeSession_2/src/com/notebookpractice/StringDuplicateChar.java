package com.notebookpractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Input : [ “http://google.com/123”, “https://google.com/234”, “fb.com”, “linkedin.com/”, “abc.org”, “abc.org/qwer” ]
Output: [google.com, abc.org]
*/
public class StringDuplicateChar {

	public static void main(String[] args) {

		String[] input = { "http://google.com/123", "http://google.com/123", "fb.com", "linkedin.com/", "abc.org",
				"abc.org/qwer" };
		/*
		 * for (int i = 0; i < input.length; i++) { for (int j = i + 1; j <
		 * input.length; j++) { if (input[i]==(input[j]));
		 * 
		 * System.out.println(input[i]);
		 * 
		 * } }
		 */

		List<String> list = Arrays.asList(input);

		Set<String> set = new HashSet<String>();

		for (String str : list) {
			boolean flagForDuplicate = set.add(str);
			if (!flagForDuplicate) {
				System.out.println(str);
			}
		}
	}

}