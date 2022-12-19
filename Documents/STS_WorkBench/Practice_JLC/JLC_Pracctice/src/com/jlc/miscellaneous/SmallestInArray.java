package com.jlc.miscellaneous;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SmallestInArray {

	public static int getSmallest(int[] a, int total) {
//		Arrays.sort(a);
//		return a[0];

		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					// a[j] = temp;
				}
			}
		}
		return a[0];

	}

	public static void main(String[] args) {
		int a[] = { 5, 4, 2, 7, 1, 3, 6 };
		int b[] = { 100, 72, 44, 88, 55, 77, 12 };
		System.out.println("Smallest::--" + getSmallest(a, 7));
		System.out.println("Smallest::--" + getSmallest(b, 7));
		List<Integer> list = Arrays.asList(5, 68, 9, 43, 23, 8);
		Collections.sort(list);
		Integer cc = list.get(0);
		System.out.println("Smallest number in CollectionList::-" + cc);

	}
}
