package com.java.pract_progrms;

public class RemoveDuplicate {
	static void removeDuplicates(int[] a, int n) {
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				temp[j++] = a[i];
			}
		}
		temp[j++] = a[n - 1];
		for (int i = 0; i < j; i++) {
			a[i] = temp[i];
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 2, 4 };
		removeDuplicates(a, 6);

	}

}
