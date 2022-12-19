package com.java8.learn;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinimumEx implements Comparator<Integer> {

	public static int swappingMethod(List<Integer> list) {
		Integer[] obj = (Integer[]) list.toArray();
		int max = 0;
		int min = 0;
		int temp = 0;
		for (int i = 0; i < obj.length; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (i < j) {
					temp = obj[i];
					obj[i] = obj[j];
					obj[j] = temp;
				}

				
			}

		}
		return temp;

	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 3, 1, 7, 0, 5, 9, 6, 8);

		Collections.sort(list, new MinimumEx());
	

		System.out.println("list values are :: " + list);

		int min = swappingMethod(list);

		System.out.println("minimum value is ::" + min);

		Optional<Integer> minNumber = list.stream().min((i, j) -> i.compareTo(j));
		System.out.println("Min value of stream :: " + minNumber.get());

		Optional<Integer> maxNumber = list.stream().max((i, j) -> i.compareTo(j));

		// * If a value is present in this returns the value,
		// otherwise throws NoSuchElementException.
		System.out.println("Max value of stream :: " + maxNumber.get());

	}

	@Override
	public int compare(Integer i, Integer j) {

		// Integer value=i.compareTo(j);
		// int b=(int)value;
		
		return (int) i.compareTo(j);//Asc order
		//return (int)-i.compareTo(j);// desc order
		//return (int) j.compareTo(i);// desc order 
		// return b;
	}

}
