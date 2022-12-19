package com.jlc.generics;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Lab651 {

	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(100, "Java");
		map.put(200, "Spring");
		map.put(300, "SpringBoot");
		map.put(400, "Hibernate");
		map.put(500, "MicroServices");
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		Iterator<Map.Entry<Integer, String>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key+"--"+val);

		}
	}
}
