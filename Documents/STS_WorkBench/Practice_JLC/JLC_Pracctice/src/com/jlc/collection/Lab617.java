package com.jlc.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab617 {
	public static void main(String[] as) {
		List list = new ArrayList();
		list.add("India");
		list.add("Pakisthan");
		list.add("NewZeland");
		list.add("Australia");
		list.add("Westindies");
		list.add("SouthAfrica");

		ListIterator listiterator = list.listIterator();
		System.out.println(list);
		while (listiterator.hasNext()) {
			Object obj = listiterator.next();
			 System.out.println(obj);
			 if(obj.equals("India"))listiterator.set("Bharath");
			 else if(obj.equals("NewZeland"))listiterator.add("Zimbombey");

		}
		System.out.println(list);
	}
}
