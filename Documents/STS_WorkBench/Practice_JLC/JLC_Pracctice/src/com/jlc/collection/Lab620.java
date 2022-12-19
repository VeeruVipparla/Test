package com.jlc.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab620 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Andra");
		list.add("Chennai");
		list.add("Bnglr");
		list.add("Mumbai");
		list.add("Kerala");
		
		ListIterator  lit=list.listIterator(2);
		do {
		int indx=lit.nextIndex();
		Object obj=lit.next();
		System.out.println(indx+"\t"+obj);
			
		}while (lit.hasNext());
			System.out.println();
			ListIterator lit1=list.listIterator(5);
			do {
				int indx=lit.previousIndex();
				Object obj=lit.previous();
				System.out.println(indx+"\t"+obj);
		}
		while (lit.hasPrevious());

	}

}
