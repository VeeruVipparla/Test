package com.interview.practice;

public class Array_Max {
	public static void main(String[] args) {
		// int a[] = { -9, -4, -6, -2, -7 ,-3};
		int a[] = { 1, 4, 6, 2, 7, 2, 8 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] >= a[j]) {
					// if (a[i] != a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		// }
		System.out.println("Second Max is::-" + a[a.length - 2]);
	}
}
