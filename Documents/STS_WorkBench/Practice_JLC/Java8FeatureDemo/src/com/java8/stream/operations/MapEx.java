package com.java8.stream.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Veeru");
		list.add("SNRaju");
		list.add("Raga");
		list.add("Veeru");

		list.stream().map(String::length).forEach(System.out::println);// @formatter:off
		System.out.println("==================");
		List<Integer> listOfIntegers = Stream.of("1", "2", "3", "4")
	               .map(Integer::valueOf)
	               .collect(Collectors.toList());
		
		listOfIntegers.forEach(System.out::println);
 	
	}
}
