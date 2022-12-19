package com.notebookpractice;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SubArraySum {
	
	private static void print(int[] nums, int i, int j) {
		System.out.println(IntStream.range(i, j + 1).mapToObj(k -> nums[k]).collect(Collectors.toList()));

	}

	private static void findSubArray(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum += nums[j];
				// if the sum so far is equal to the given sum
				if (sum == target) {
					print(nums, i, j);
				}
			}
		}

	}

	public static void main(String[] args) {
		int[] nums = { 3, 4, -7, 1, 3, 3, 1, -4 };
		int target = 6;

		findSubArray(nums, target);
	}

}
