package com.practiceprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "Veeru");
		map.put(2, "Mani");
		map.put(3, "Veeru");
		map.put(3, "Mani");

		Set s = map.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext()) 
			System.out.println(it.next());
		}
	

}
