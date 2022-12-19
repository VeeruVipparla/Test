package com.java8.stream.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceEx {
	public String show(String s1, String s2) {
		String str = s1 + "#" + s2;
		return str;
	}

	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Veeru");
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");

		Optional<String> reduced = memberNames.stream().reduce((s1, s2) -> s1 + "\t * " + s2);

		reduced.ifPresent(System.out::println);

	}

}
