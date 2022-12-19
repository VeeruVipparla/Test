package com.interview.practice;

import java.util.HashMap;

public class Map_Duplicate {

	private static void removeDups(int[] arr, int n) {

		// Hash map which will store the
		// elements which has appeared previously.
		HashMap<Integer, Boolean> mp = new HashMap<>();

		// Print the element if it is not
		// there in the hash map
		for (int i = 0; i < arr.length; i++) {
			if (mp.get(arr[i]) == null)
				System.out.print(arr[i] + "");

			// Insert the element in the hash map
			mp.put(arr[i], false);
		}
	}

	// Driver Code
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 3, 2 };
		int n = arr.length;
		removeDups(arr, n);

	}

}
//console::- (1,2,3,4,5)