package com.java8.stream.operations;

import java.util.Optional;
import java.util.stream.Stream;

public class FindAnyEx {
	public static void main(String[] args) {
		Optional<String> anyElement = Stream.of("First", "Second", "Third", "Fourth").findAny();
		System.out.println(anyElement);
		if (anyElement.empty() != null) {
			Optional anyElement1 = Stream.of("12", "20").findAny();
			System.out.println("anyElement checking :: " + anyElement1);
		}
	}
}
