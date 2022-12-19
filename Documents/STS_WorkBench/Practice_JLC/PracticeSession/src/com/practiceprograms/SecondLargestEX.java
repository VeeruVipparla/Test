package com.practiceprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SecondLargestEX {
	public static void main(String args[]) {
		Integer a[] = { 1, 4, 2, 6, 4, 7, 7, 1, 2, 3, 4 };// 1,2,3,4,6,7
		Set s = new HashSet(Arrays.asList(a));
		System.out.println(s.size());;
	
		
		System.out.println(s);
		int temp;
		for (int i = 0; i <a.length; i++) {
			for (int j = i + 1; j <a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(a[a.length - 2]);
	}
}
