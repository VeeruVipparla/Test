package com.snr.miscellaneous;

import java.util.Scanner;

public class PyramidPat1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// taking no of Rows value from the user
		System.out.println("How many rows you want in your Pyramid?");
		int noofRows = sc.nextInt();
		// Initializing the rowCount with 1
		int rowCount = 1;
		System.out.println("Here is your Pyramid");
		// Implementing the logic
		for (int i = noofRows; i > 0; i--) {
			// Printing i spaces at the beginning of each row

			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			// Printing 'rowCount' value 'rowCount' times at the end of each row

			for (int j = 1; j <= rowCount; j++) {
				System.out.print(rowCount + " ");
			}

			System.out.println();

			// Incrementing the rowCount

			rowCount++;
		}

	}
}