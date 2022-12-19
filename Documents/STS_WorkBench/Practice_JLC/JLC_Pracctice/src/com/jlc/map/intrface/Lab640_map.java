package com.jlc.map.intrface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Lab640_map {

	public static void main(String[] args) {
		Map m=new LinkedHashMap();
		System.out.println(m);
		m.put(10,"veeru");
		m.put(11, "Rama");
		m.put(100,200);
		m.put(11, "Raju");
		
		System.out.println(m.size());
		System.out.println(m);
		System.out.println(m.isEmpty());
		m.put("eId::", new Integer(150));
		m.put("eName::", new String("Lasya"));
		m.put("Phone::", new Long(34567890));
		m.put("Email", new String("veeruvipparla"));
		m.put("Valid::", new Boolean(true));
		System.out.println(m);
		System.out.println("=========================");
		
		System.out.println(m.containsKey("Valid::"));
		System.out.println(m.containsValue("veeruvipparla"));
		System.out.println(m.containsValue("kholi"));
		
		
		//System.out.println(m.remove(10));
		//System.out.println(m);
		System.out.println(m.remove(10, "veeru"));
		System.out.println(m);
		m.clear();
		System.out.println(m);
		System.out.println(m.isEmpty());
	}

}
