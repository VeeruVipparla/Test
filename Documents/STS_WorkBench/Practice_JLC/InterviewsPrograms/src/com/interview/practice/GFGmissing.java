package com.interview.practice;

public class GFGmissing {

	// a represents the array
	// n : Number of elements in array a
	static int getMissingNo(int arr[], int n) {
		int total = 1;
		for (int i = 2; i <= (n+1); i++) {
			total += i;// [total=total-i]
			total -= arr[i - 2];// [total=total-a[i-2]
		}
		return total;
	}

	// Driver Code
	public static void main(String[] args) {
		int[] arr = { 1, 4, 3, 7, 2, 6 };
		System.out.println(getMissingNo(arr,6));
	}
}
