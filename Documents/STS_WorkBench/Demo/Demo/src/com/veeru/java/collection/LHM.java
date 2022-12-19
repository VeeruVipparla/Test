package com.veeru.java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class LHM {

	public static void main(String[] args) {
		HashMap<Integer, String> lhm=new HashMap<>();
		lhm.put(100, "Rama");
		lhm.put(200, "RagaSpandana");
		lhm.put(300, "Lasya");
		lhm.put(400, "Veeru");
		lhm.put(500, "Raju");
		lhm.put(600, "Raju");
		lhm.put(700, "Raju");
		
		System.out.println(lhm);
		lhm.remove(300);
		System.out.println(lhm);
		Set<Entry<Integer, String>>  set=lhm.entrySet();
		
		Iterator<Entry<Integer, String>> itr=set.iterator();
		
		while (itr.hasNext()) {
			Map.Entry<Integer,String> entry = (Map.Entry<Integer,String>)itr.next();
			System.out.println("Key :"+entry.getKey()+"\t"+"value :"+entry.getValue());
		}		
		
		/*
		 * System.out.println("entrySet() method --->  :"+ lhm.entrySet());
		 * System.out.println("keySet() method --->  :"+ lhm.keySet());
		 * System.out.println("values() method --->  :"+ lhm.values());
		 */
		
		  /*for(Map.Entry<Integer, String> entry:lhm.entrySet()) {
		  System.out.println(entry.getKey()+"\t"+entry.getValue());
		  }
		  
		  
		  for(Integer key:lhm.keySet()) {
			  System.out.println("key ::"+key);
			  }
		  
		  

		  for(String value:lhm.values()) {
			  System.out.println("value ::"+value);
			  }
		  
		  */
		  
		 
		
	}

}















/*

{100=Rama, 200=RagaSpandana, 300=Lasya, 400=Veeru, 500=Raju}
{100=Rama, 200=RagaSpandana, 400=Veeru, 500=Raju}
Key :100	value :Rama
Key :200	value :RagaSpandana
Key :400	value :Veeru
Key :500	value :Raju

*/