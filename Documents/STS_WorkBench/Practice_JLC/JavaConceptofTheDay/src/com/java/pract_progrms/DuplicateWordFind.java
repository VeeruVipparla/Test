package com.java.pract_progrms;

public class DuplicateWordFind {
	public static void main(String[] args) {
		String str = "Java Program Learning By Java Learning Center ";
		int count;
		// Converting the toLowerCase
		String[] strArray = str.toLowerCase().split(" ");
		// String[] strArray = str.split(" ");
		System.out.println("Duplicate Words in given String");
		for (int i = 0; i < strArray.length; i++) {
			count = 1;
			for (int j = i + 1; j < strArray.length; j++) {
				if (strArray[i].equals(strArray[j])) {
					count++;
					// Set strArray[j] to 0 to avoid printing visited word
					// strArray[j] = "0";
				}
			}
			// Display the Duplicate word if count in greaterthan 1
			if (count > 1)// && strArray[i] != "0")
				System.out.println(strArray[i]);
		}
	}
}
