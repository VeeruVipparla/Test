package com.snr.interview.test.programs;

public class ReverseEachWord {

	public static void main(String[] args) {

		reverseWord("veeru is a good boy"); // ureev era doog yob

		// yob doog a si ureev

	}

	public static void reverseWord(String inputString) {// length()
		// System.out.println(words.length());

		String words[] = inputString.split(" ");
		// System.out.println(words.toString());

		String reverseString = "";

		for (int i = 0; i < words.length; i++) {
			String word = words[i];

			String reveseword = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				// reveseword=reveseword+word.charAt(j);
				reveseword += word.charAt(j);
				// System.out.println(reveseword);

			}

			// reverseString=reverseString+reveseword+" ";
			reverseString += reveseword + " ";

		}

		System.out.println(inputString);
		System.out.println(reverseString);
		System.out.println("=====================");

		/*
		 * for (int i = 0; i < ch.length; i++) { System.out.println(ch[i]);
		 * 
		 * }
		 */

		/*
		 * char[] ch=words.toCharArray();//length System.out.println(ch.length);
		 * 
		 * for(int i=ch.length-1;i>=0; i--) { System.out.print(ch[i]);
		 * 
		 * }
		 */

	}

}
