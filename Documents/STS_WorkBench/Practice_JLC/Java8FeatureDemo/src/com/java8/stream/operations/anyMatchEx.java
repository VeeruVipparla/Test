package com.java8.stream.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class anyMatchEx {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("David");
		names.add("SNRaju");
		names.add("Johnson");
		names.add("Samontika");
		names.add("Brijesh");
		names.add("John");

		if (names.stream().anyMatch((String name) -> name.length() > 5)) {
			System.out.println("Yes... There is a name exist with 5 letters");
			List<String> listNames = names.stream().filter((String name) -> name.length() > 5)
					.collect(Collectors.toList());
			listNames.forEach(System.out::println);
			Long count = names.stream().filter((String name) -> name.length() > 5).count();
			System.out.println("name.length() >5 :: " + count);
		}
		if (names.stream().anyMatch((String name) -> name.contains("John"))) {

			System.out.println("Yes... John is available ");

		} else {
			System.out.println("No... Rutvik is not available ");
		}
		
		
		System.out.println("========================");
		List<String> listNamesStratWithS = names.stream().filter((String name) -> name.startsWith("J"))
				.collect(Collectors.toList());
		listNamesStratWithS.forEach(System.out::println);
	}
}
