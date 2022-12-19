package com.snr.miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDupNum {

	public static void main(String[] args) {
		//int[] i={5, 3, 4, 1, 3, 7, 2,3,1, 9, 9, 4,1};
		List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2,3,1, 9, 9, 4,1);
		Set<Integer> s = new HashSet(list);
		System.out.println(s);

		List<Integer> list1 = Arrays.asList(1, 2, 1, 2, 3, 4, 4, 5, 6, 5);
		List<Integer> listDuluicate = new ArrayList<>();

		for (Integer a :list1) {
			if (!listDuluicate.contains(a)) {
				listDuluicate.add(a);
			}
		}
		System.out.println(listDuluicate);

	}

}
