package com.java8.stream.operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArrayWEx {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("David");
		names.add("Johnson");
		names.add("Samontika");
		names.add("Brijesh");
		names.add("John");
		// Storing first 3 names in an array
		Object[] streamArray = names.stream().toArray();// limit(3)
		System.out.println(Arrays.toString(streamArray));

	}
}
