package com.practiceprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplictateRemoveEX {
	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 1, 3);
		List<Integer> duplicateList = new ArrayList<>();
		for (Integer i : list) {
			if (!duplicateList.contains(i)) {
				duplicateList.add(i);
			}
		}
		System.out.println(duplicateList);
	}
}
