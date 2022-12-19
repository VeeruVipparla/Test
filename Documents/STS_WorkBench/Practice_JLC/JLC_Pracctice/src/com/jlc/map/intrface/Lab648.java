package com.jlc.map.intrface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Lab648 {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("166", "veeru");
		map.put(100, "Veru");

		Map map1 = new HashMap();
		map1.put(116, "SaiPallavi");
		map1.put("Remmunration", "1cr");

		System.out.println(map);
		System.out.println(map1);
		map.putAll(map1);
		System.out.println(map);
		System.out.println(map1);

		Set keys = map.entrySet();
		Iterator it=keys.iterator();
		
		while(it.hasNext()) {
			//System.out.println(it.next());
			Object obj=	it.next();
			Map.Entry entry=(Entry) obj;
			
			Object key=entry.getKey();	
			Object val=	entry.getValue();
			System.out.println(key+"--"+val);
			
	}
	}
}
