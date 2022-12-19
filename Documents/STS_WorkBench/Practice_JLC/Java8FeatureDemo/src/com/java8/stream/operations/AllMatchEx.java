package com.java8.stream.operations;

import java.util.ArrayList;
import java.util.List;

public class AllMatchEx {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Sampada");
		names.add("Johnson");
		names.add("Samontika");
		names.add("Brijesh");
		if (names.stream().allMatch((String name) -> name.length() > 5)) {
			System.out.println("All are big names");
		}

	}

}
