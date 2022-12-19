package com.interview.practice;

import java.util.Arrays;
import java.util.List;

public class ListDuplicatePrint {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 4, 2, 3);
		Object obj[] = list.toArray();
		for (int i = 0; i < obj.length; i++) {
			for (int j = i + 1; j < obj.length; j++) {
				if (obj[i] == obj[j])
					System.out.println(obj[j]);
			}
		}
		System.out.println("======================");
		List<String> list1 = Arrays.asList("veeru", "pavan", "Badri", "Veeru", "veeru");
		Object obj1[] = list1.toArray();
		for (int k = 0; k < obj1.length; k++) {
			for (int k2 = k + 1; k2 < obj1.length; k2++) {
				if (obj1[k] == obj1[k2]) {
					System.out.println(obj1[k2]);
				}
			}

		}

	}

}
