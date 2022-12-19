package com.java8.miscellaneous;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SmallNo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5, 9, 9, 78, 66, 21, 54, 7, 54, 78);

		List<Integer> naturalOrder = list.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println("Natural Order List" + naturalOrder);
		List<Integer> reverseOrder = list.stream().sorted(Comparator.reverseOrder()).distinct()
				.collect(Collectors.toList());
		System.out.println("reverse Order List" + reverseOrder);

		List<Integer> listOrder = list.stream().sorted((o1, o2) -> o2.compareTo(o2)).collect(Collectors.toList());
		System.out.println("LIST OF ORDER" + listOrder);

		Optional<Integer> min = listOrder.stream().min((a, b) -> a.compareTo(b));
		System.out.println("Minimum value :: " + min.get());
		Optional<Integer> max = listOrder.stream().max((a, b) -> a.compareTo(b));
		System.out.println("Maximum value :: " + max.get());

	}

}
