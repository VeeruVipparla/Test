package com.jlc.collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class Lab667 {


	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new StringBuilder("Bahubali"));
		list.add(new StringBuilder("Sahoo"));
		list.add(new StringBuilder("Salar"));
		list.add(new StringBuilder("Chatrapthi"));
		list.add(new StringBuilder("Darling"));
		list.add(new StringBuilder("MR.perfect"));
		
		System.out.println(list);
		//Collections.sort(list);//java.lang.ClassCastException:
		System.out.println("==============");
		System.out.println(list);
		System.out.println("\n Sorting StringBuffer");
		Collections.sort(list, new StringBuilderComp());
		System.out.println(list);
	}

}

 class StringBuilderComp implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s1.compareTo(s2);
	}

}
	
