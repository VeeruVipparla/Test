package com.java8.learn;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortEx {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 3, 1, 7, 0, 5, 9, 6, 8);

		List<Integer> listorder = list.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());

		
		List<Integer> naturalOrder = list.stream().sorted().collect(Collectors.toList());
		System.out.println("natural Order ::  "+naturalOrder);
		
		List<Integer> reverseOrder = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("reverse Order ::  "+reverseOrder);

		
		
		System.out.println(" list of order " + listorder);
		Optional<Integer> min = listorder.stream().min((i, j) -> i.compareTo(j));
		System.out.println("Minimum value :: " + min.get());

		Optional<Integer> max = listorder.stream().max((i, j) -> i.compareTo(j));
		System.out.println("Maximum value :: " + max.get());
	}

}
