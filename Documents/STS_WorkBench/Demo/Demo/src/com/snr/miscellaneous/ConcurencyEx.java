package com.snr.miscellaneous;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurencyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> map=new ConcurrentHashMap<>();
		
		map.put("aaa", "Banana");
		map.put("bbb", "Gauva");
		map.put("ccc", "PineApple");
		
		
		Set<Map.Entry<String, String>> set=map.entrySet();//key- value pairs
		
		//Set<String> s1=map.keySet(); //keys 
		
		//Collection<String> c=map.values();//values
		
		Iterator<Entry<String, String>>   it=set.iterator();
		
		while(it.hasNext()) {
			map.put("ddd", "Mongo");
			Entry<String, String> entry=it.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}

	}

}
