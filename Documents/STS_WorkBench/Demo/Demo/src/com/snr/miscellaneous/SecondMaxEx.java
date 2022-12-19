package com.snr.miscellaneous;

public class SecondMaxEx {
	public static void main(String args[]) {

		int[] a = { 2, 3, 9, 9, 4, 5, 6 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {

					if (a[i] != a[j]) {

						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}
		System.out.println(a[a.length - 2]);
	}
}
