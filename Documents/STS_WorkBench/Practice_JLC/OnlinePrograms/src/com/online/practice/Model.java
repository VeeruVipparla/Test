package com.online.practice;

// Online IDE - Code Editor, Compiler, Interpreter
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.*;

public class Model {
	public static void main(String[] args) {
		System.out.println("Welcome to Online IDE!! Happy Coding :)");
		List<Integer> listNumbers = Arrays.asList(1, 2, 5, 7, 5, 6, 1, 2, 3, 4, 2, 6, 7, 8, 9, 8, 7, 3, 2, 6, 7);// grapes

		List<String> listStr = Arrays.asList("Apple", "Banana", "watermelon", "Grapes", "Orange", "strawberry",
				"Pineapple", "Apple", "watermelon", "Guava", "Orange", "Banana", "Pineapple");

		Map<Integer, Long> output = listNumbers.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		output.forEach((key, value) -> {
			System.out.println(key + " - " + value);
		});

		Map<String, Long> output2 = listStr.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		output2.forEach((key, value) -> {
			System.out.println(key + " - " + value);
		});

		System.out.println("======below java 1.7V ======");

		Map<String, Integer> map = new HashMap<>();

		for (String str : listStr) {
			if (map.containsKey(str)) {
				int count = map.get(str);
				count++;
				map.put(str, count);
				// map.put(str, map.get(str)+1);
			} else {
				map.put(str, 1);
			}
		}
		
		map.forEach((key, value) -> {
			System.out.println(key + " :: " + value);
		});

	}
}
