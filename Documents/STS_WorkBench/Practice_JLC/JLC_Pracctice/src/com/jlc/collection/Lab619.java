package com.jlc.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab619 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Andra");
		list.add("Chennai");
		list.add("Bnglr");
		list.add("Mumbai");
		list.add("Kerala");

		ListIterator lit = list.listIterator();
		System.out.println("Forward Direction ");
		while (lit.hasNext()) {
			
			int indx = lit.nextIndex();
			Object obj = lit.next();
			
			System.out.println(indx + "\t" + obj);

		}
		System.out.println();
		System.out.println("Reverse Direction");
		while (lit.hasPrevious()) {
			int pindx = lit.previousIndex();
			Object pobj = lit.previous();
			System.out.println(pindx + "\t" + pobj);
		}

	}

}
