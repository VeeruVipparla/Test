package com.online.practice;

public class LargestNumberinArray {

	public static void main(String[] args) {
		int a[] = { 6,6, 2, 7, 4, 9, 3 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(a[a.length - 2]);
	}

}
