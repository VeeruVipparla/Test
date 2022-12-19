package com.notebookpractice;

import java.util.Arrays;

public class ArrayRotation {

	// Function to right-rotate an array by one position
	public static void rightRotateByOne(int[] A)
	{
		int last = A[A.length - 1];
		for (int i = A.length - 2; i >= 0; i--) {
			A[i + 1] = A[i];
		}

		A[0] = last;
	}

	// Function to right-rotate an array by `k` positions
	public static void rightRotate(int[] A, int k)
	{
		// base case: invalid input
		if (k < 0 || k >= A.length) {
			return;
		}

		for (int i = 0; i < k; i++) {
			rightRotateByOne(A);
		}
	}

	public static void main(String[] args)
	{
		int[] A = { 1, 2, 3, 4, 5, 6, 7, 8 };
	//   int[] A={21,54,11,35,4,18,22,44};
	//	int [] A= {8,7,4,6,9,3,2,1};
		int k = 4;

		rightRotate(A, k);

		System.out.println(Arrays.toString(A));
	}
}
