package com.jlc.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab614 {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("Apple");
		list.add("Mango");
		list.add("Guava");
		list.add("Berry");
		list.add("Grapes");
		list.add("PineApple");

		Iterator it = list.iterator();
		int size = list.size();
		
		// if(it.hasNext())
		// for (int i = 0; i <size; i++)
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		System.out.println(it.next());
		System.out.println("Main closed");

	}

}
