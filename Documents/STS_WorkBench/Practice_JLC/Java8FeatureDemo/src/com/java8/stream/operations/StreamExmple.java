package com.java8.stream.operations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StreamExmple {
	static Map<String, String> map = new HashMap<>();

	public static void show(String name) {
		if (!map.containsKey(name)) {
			if (map.size() != 1)
				if (name.length() > 5) {
					map.put(name, name);
					System.out.println("Core Java 7 :: " + name);
				}
		}
	}

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("applea");
		list.add("applea");
		list.add("Banana");
		list.add("Guava");

/*		for (String str : list) {
			// if(!list.contains(str)) {
			show(str);
			// }
		}
*/
		list.stream().filter((String name) -> name.length() >= 5).distinct().limit(4).forEach(System.out::println);
		// list.stream().filter(n-> n.contains("apple")).forEach(System.out::println);

	}

}
