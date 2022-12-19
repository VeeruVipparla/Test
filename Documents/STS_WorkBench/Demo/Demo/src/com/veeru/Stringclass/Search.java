package com.veeru.Stringclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// this is achieved by comparing the searching string with each of
//the array elements one by one in a loop
public class Search {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("How many Strings? ");
		int n = Integer.parseInt(br.readLine());
		String str[] = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter a String: ");
			str[i] = br.readLine();
		}
		System.out.println("Enter a string to search:");
		String search=br.readLine();
		
		boolean found = false;

		for (int i = 0; i < n; i++) {
			if (search.equalsIgnoreCase(str[i])) {
				System.out.println("Found at position: " + (i + 1));
				found = true;
			}
		}
		if (!found)
			System.out.println("Not found in the group");

	}

	
	
}
