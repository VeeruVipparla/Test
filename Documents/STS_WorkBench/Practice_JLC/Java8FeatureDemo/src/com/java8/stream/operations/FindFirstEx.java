package com.java8.stream.operations;

import java.util.Optional;
import java.util.stream.Stream;

public class FindFirstEx {
	public static void main(String[] args) {
		// A container object which may or may not contain a non-null value.
		// If a value is present, isPresent() will return true and get() will return the
		// value.
		Optional<String> firstElement = Stream.of("First", "Second", "Third", "Fourth").findFirst();
		// System.out.println(firstElement);
		if (firstElement.isPresent()) {
			System.out.println(firstElement);
		}
	}
}
