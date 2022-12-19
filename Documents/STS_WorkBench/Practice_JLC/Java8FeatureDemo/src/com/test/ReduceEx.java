package com.test;

import java.util.Arrays;
import java.util.OptionalInt;

public class ReduceEx {

	public void calculate(int[] arr, int a, int b) {

		for (int i = 0; i < arr.length; i++) {

		}

	}

	public static void main(String[] args) {
		int sum = Arrays.stream(new int[] { 7, 5, 9, 2, 8, 1 }).reduce(0, (a, b) -> a + b);
		System.out.println("Sum ::" + sum);

		int sum1 = Arrays.stream(new int[] { 7, 5, 9, 2, 8, 1 }).reduce(0, Integer::sum);
		System.out.println("Sum1 ::" + sum1);

		int min = Arrays.stream(new int[] { 7, 5, 9, 2, 8, 1, 0 }).reduce(2, Integer::min);
		System.out.println("min ::" + min);

		int max = Arrays.stream(new int[] { 7, 5, 9, 2, 8, 1 }).reduce(1, Integer::max);
		System.out.println("min ::" + max);

		OptionalInt optSum = Arrays.stream(new int[] { 7, 5, 9, 2, 8, 1 }).reduce((a, b) -> a + b);

		System.out.println("optSum :: " + optSum);

		OptionalInt minValue = Arrays.stream(new int[] { 7, 5, 9, 2, 8, 1 }).min();

		System.out.println("min value :: " + minValue);

		OptionalInt maxValue = Arrays.stream(new int[] { 7, 5, 9, 2, 8, 1 }).max();
		System.out.println("maxValue :: " + maxValue);

		// Output : OptionalInt[9]

	}

}

/*
 * 12, 9= 21
 * 
 * 21 2= 23
 * 
 * 23 8=31
 * 
 * 31 1=32
 */