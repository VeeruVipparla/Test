package com.java.pract_progrms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DupliateValues {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 3, 6, 4, 6, 3);
		/*
		 * List<Integer> listOfDuplicate = new ArrayList<>(); for (Integer i : list) {
		 * if (!listOfDuplicate.contains(i)) {
		 *  listOfDuplicate.add(i);
		 *   }
		 *   }
		 * System.out.println(listOfDuplicate);
		 */
		Object[] obj = list.toArray();
		for (int i = 0; i < obj.length; i++) {
			for (int j = i + 1; j < obj.length; j++) {
				if (obj[i] == obj[j]) {
					System.out.print(obj[j]);
				}
			}

		}

	}
}
