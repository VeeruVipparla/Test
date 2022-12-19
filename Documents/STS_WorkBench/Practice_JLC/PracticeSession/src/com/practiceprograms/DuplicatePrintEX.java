package com.practiceprograms;

import java.util.Arrays;
import java.util.List;

public class DuplicatePrintEX {
	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 4);
		Object[] obj = list.toArray();
		for (int i = 0; i < obj.length; i++) {
			for (int j = i + 1; j < obj.length; j++) {
				if (obj[i].equals(obj[j])) {
					System.out.println(obj[i]);
				}
			}
		}
	}
}
