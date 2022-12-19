package com.interview.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11, 22, 3, 46, 77);
		Collections.sort(list);
		Integer small = list.get(0);
		System.out.println(small);

	}

}
