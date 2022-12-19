package com.interview.practice;

public class MissingNum {
	public static void main(String[] args) {

		int[] number = { 5, 1, 3, 2, 8, 4, 10, 6, 7 };
		System.out.println("The Missing Number is::-" + getMissedNum(number));

	}

	static int getMissedNum(int arr[]) {
		int b, total;
		int n = arr.length;
		total = (n + 1) * (n + 2) / 2;
		for (int i = 0; i < n; i++) {
			total -= arr[i];

		}
		return total;
// (arr[arr.length-1] * (arr[arr.length-1] + 1)) / 2;
	}
}