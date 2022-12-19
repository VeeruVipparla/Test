package com.jlc.map.intrface;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Lab642 {

	public static void main(String[] args) {
		Map map=new LinkedHashMap();
		map.put("eId", new Integer(100));
		map.put("eName", new String("RagaSpandana"));
		map.put("Salary", new Long(234567));
		map.put("Address", new String("Banglore"));
		System.out.println(map);
		System.out.println("put-phone:"+map.put("phone", new Long(7893548243L)));
		System.out.println(map);
/*		Set keys=map.keySet();
		Iterator it=keys.iterator();
		while(it.hasNext()) {
			Object key=it.next();
			System.out.println(key);
		}
			System.out.println("\n ** values**");
			Collection  col=map.values();
			Iterator it1=col.iterator();
			while(it1.hasNext()) {
				Object val=it1.next();
				System.out.println(val);
				
			}
*/		
		System.out.println("==================");
		Set key =map.entrySet();
		Iterator it=key.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	}

}
