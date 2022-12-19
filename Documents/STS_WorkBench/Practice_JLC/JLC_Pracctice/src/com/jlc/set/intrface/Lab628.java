package com.jlc.set.intrface;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Lab628 {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		/*ts.add("Idian Ocean");
		ts.add("Atlantic Ocean");
		ts.add("Pacific Ocean");
		ts.add("Arcitic Ocean");
		ts.add("Antarctic Ocean");
		System.out.println(ts);
		
		Object  obj[]=ts.toArray();
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}*/
		System.out.println("=================");
		ts.add(11);
		ts.add(4);
		ts.add(66);
		ts.add(23);
		ts.add(21);
		ts.add(73);
		ts.add(88);
		ts.add(4);
		System.out.println(ts);
		
		NavigableSet ts1=ts.descendingSet();
		System.out.println(ts1);
		
		System.out.println("Ascending Order");
		
		Iterator it=ts.iterator();
		
		while(it.hasNext()) 
			System.out.println(it.next());
		
		System.out.println("Descending Orderss");
		
		Iterator desc=ts.descendingIterator();
		while(desc.hasNext())
			System.out.println(desc.next());
		
		
	}

}
