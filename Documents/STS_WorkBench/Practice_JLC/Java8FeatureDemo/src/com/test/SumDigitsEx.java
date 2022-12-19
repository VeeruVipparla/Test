package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SumDigitsEx {

	public static void main(String[] args) {

		int sum = Arrays.stream(new int[] { 1, 3, 5, 2, 5 }).reduce(0, (a, b) -> a + b);
		System.out.println("Sum ::" + sum);

		List<Integer> list = Arrays.asList(5, 2, 5, 7, 2, 8, 3, 9, 1);
		list.stream().sorted().distinct().collect(Collectors.toList()).forEach(System.out::println);
		Optional<Integer> max = list.stream().max((a, b) -> a.compareTo(b));
		System.out.println(max);
		List<Integer> reverse= list.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverse);
		
		

	}

}
