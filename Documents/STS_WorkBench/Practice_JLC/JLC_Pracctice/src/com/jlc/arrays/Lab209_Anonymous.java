package com.jlc.arrays;

public class Lab209_Anonymous {

	public static void main(String[] args) {
		int arr[] = null;
		int arr1[] = { 99, 88, 77 };
		// arr=new int[] {66,55,44};
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("===========");
		int[] a = { 99, 88, 77, 66 };
		show(a);
		int[] b = { 10, 20, 30 };
		show(b);
		show (new int [] {99,88,77,66});

	}

	static void show(int arr2[]) {
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("=================");
	}

}
