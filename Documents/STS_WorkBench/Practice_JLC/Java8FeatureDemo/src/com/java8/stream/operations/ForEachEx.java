package com.java8.stream.operations;

import java.util.stream.Stream;

public class ForEachEx {

	public static void main(String[] args) {

		Stream.of("First", "Second", "Second", "Third", "Fourth").limit(5).distinct().forEach(System.out::println);

	}
}
