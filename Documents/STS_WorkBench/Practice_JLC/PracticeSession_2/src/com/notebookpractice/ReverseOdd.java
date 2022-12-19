package com.notebookpractice;

public class ReverseOdd {
	public static void main(String args[]) {
		// int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int ar[] = { 8, 7, 4, 6, 9, 3, 2, 1 };
		
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				System.out.print(" " + ar[i]);
			} else {
				for (int j = ar.length - i; j >= 0; j--) {
				if (ar[j] % 2 != 0) {
						System.out.print(" " + ar[j]);
						break;
					}

				}
			}
		}
	}
}
