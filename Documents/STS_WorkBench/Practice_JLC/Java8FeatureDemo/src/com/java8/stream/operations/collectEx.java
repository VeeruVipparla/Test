package com.java8.stream.operations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class collectEx {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(12);
		list.add(12);
		list.add(17);
		list.add(20);
		list.add(12);

		Set<Integer> resultS = new HashSet<>(list);
		System.out.println("java 7 set " + resultS);
		System.out.println(resultS);

		System.out.println("============List below=============");
		List<Integer> result = list.stream().collect(Collectors.toList());
		result.forEach(System.out::println);
		System.out.println(result);

		System.out.println("============set below=============");

		Set<Integer> resultSet = list.stream().collect(Collectors.toSet());
		resultSet.forEach(System.out::println);
		System.out.println(resultSet);

		List<String> names = new ArrayList<>();

		names.add("David");
		names.add("Johnson");
		names.add("Samontika");
		names.add("Brijesh");
		names.add("John");
		// Storing first 3 names in a mutable container

		List<String> first3Names = names.stream().limit(3).collect(Collectors.toList());

		System.out.println(first3Names);

	}

}
