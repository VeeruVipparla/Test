package com.jlc.collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Lab661 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Srinivas");
		list.add("Veeru");
		list.add("Working");
		list.add("OnThread");
		System.out.println("List::" + list);
		Iterator it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
//Copy to the another Collection
		List list2 = new ArrayList();
		list2.add("Java");
		list2.add("SB");
		list2.add("Hibernate");
		list2.add("MVC");
		System.out.println("List2::" + list2);

		Collections.copy(list2, list);
		

		System.out.println("List2::" + list2);

	}

}
