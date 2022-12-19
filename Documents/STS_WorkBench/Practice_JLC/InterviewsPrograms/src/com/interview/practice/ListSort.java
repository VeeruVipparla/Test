package com.interview.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSort {

	private static Integer getSecondLargest(Integer[] a, Integer total) {
		List<Integer> list = Arrays.asList(a);
		Collections.sort(list);
		Integer number = list.get(total - 2);

		return number;
	}

	public static void main(String[] args) {
		Integer[] a = { 46, 33, 1, 23, 82 };
		System.out.println("SecondLargest::-" + getSecondLargest(a, 5));

	}

}
