package com.practiceprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Array_2nd {

	public static void main(String[] args) {
		int[] a = { 6, 8, 2, 4, 3, 1, 5, 7, 7, 8, 8 };
		SortedSet<Integer> set = new TreeSet<>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
//		set.forEach(System.out::println);
/*
		if (set.size() >= 2) {
			set.remove(set.last());
			System.out.println("Second Max Is =" + set.last());
		} else {
			System.out.println("There is no Second Maximum");
		}
*/
		//System.out.println(set.));
		List list=new ArrayList<>(set);
		System.out.println(list);
		
	}

}
