package com.interview.practice;

import java.util.Arrays;

public class CollectionSort {

	static int getSecondLargest(int[] a, int total) {
		Arrays.sort(a);

		return a[total - 2];
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 5, 7, 8 };
		System.out.println("SecondLargest::-" + getSecondLargest(a, 6));

	}

}
