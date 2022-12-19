package com.veeru.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

class Rnumbers{
	public static void main(String[] args) {
		
		SortedSet bikes= new TreeSet();
		
		bikes.add("Yamaha RX100");
		bikes.add("Suzuki Gixer");
		bikes.add("Treumph Bolt");
		bikes.add("Harley Davidson");
		bikes.add("ROYAL BULLET");
		
		System.out.println("List of the bikes::"+"\n"+bikes);
		System.out.println("adding one bike::"+ bikes.add("Pulser"));
		System.out.println("size of the TreeSet::"+ bikes.size());
		
		
		Iterator itr= bikes.iterator();
		while (itr.hasNext()) {
			Object obj=itr.next();
			System.out.println(obj);
		}
		
		
		
	}
}

















/*
 * public class Rnumbers {
 * 
 * public static void main(String[] args) { LinkedList lil = new LinkedList();
 * lil.add("Carbon"); lil.add("Hydrogen"); lil.add("Aluminium");
 * lil.add("Copper"); System.out.println(lil);
 * System.out.println("size if the LIL::"+lil.size());
 * System.out.println(lil.add("\t"+"oxygen")); System.out.println(lil);
 * System.out.println(lil.remove("Copper")); System.out.println(lil);
 * lil.clear(); System.out.println("Elements in object::"+ lil);
 * System.out.println("lil is empty::"+ lil.isEmpty());
 * System.out.println("Adding the Aurum::"+ lil.add("Aurum"));
 * System.out.println("elements in lil::"+lil);
 * System.out.println(lil.removeAll(lil));
 * System.out.println("elements in lil::"+lil);
 * System.out.println("Adding the Zinc::"+ lil.add("Zinc"));
 * System.out.println("elements in lil::"+ lil); } }
 */


/*public static void main(String[] args) {

		ArrayList<Integer> numbers= new ArrayList<Integer>();

		numbers.add(9);
		numbers.add(23);
		numbers.add(10);
		numbers.add(01);
		Iterator<Integer> it = numbers.iterator();

		while(it.hasNext()) {
			Integer i = it.next();
			if(i < 10) {
				it.remove();
			}
		}
		System.out.println(numbers);
	}
}*/





