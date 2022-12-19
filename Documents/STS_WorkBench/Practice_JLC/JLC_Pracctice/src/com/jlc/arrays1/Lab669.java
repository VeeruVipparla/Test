package com.jlc.arrays1;

import java.util.Arrays;

public class Lab669 {

	public static void main(String[] args) {
		int arr[] = new int[] { 10, 43,  };
		System.out.println("\n Natural Order");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "\t" + arr[i]);
			System.out.println("\n Sorted Order");
			Arrays.sort(arr);
			for (int j = 0; j < arr.length; j++) {
				System.out.println(i + "\t" + arr[j]);
				System.out.println("\n Binary Search--");
				int indx = Arrays.binarySearch(arr, 23);
				System.out.println(indx);
				indx = Arrays.binarySearch(arr, 43);
				System.out.println(indx);
				System.out.println("\n Equals(int[],int[])");
				int values[] = new int[] { 43, 23, };//{ 10, 43, 23, 89, 45 };
				System.out.println(Arrays.equals(arr, values));
				int data[] = new int[] { 43, 23, };
				System.out.println(Arrays.equals(values, data));

			}
		}

	}

}
