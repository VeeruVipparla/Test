package com.java8.stream.operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class countEx {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();

		names.add("David");
		names.add("Johnson");
		names.add("Samontika");
		names.add("Brijesh");
		names.add("John");
		// Counting the names with length > 5

		long noOfBigNames = names.stream().filter((String name) -> name.length() > 5).count();

		System.out.println(noOfBigNames);
		List<Integer> intList = Arrays.asList(10, 20, 30);
		long count = intList.stream().filter(i -> i % 2 == 0).count();
		System.out.println("integer count :: " + count);

	}

}
