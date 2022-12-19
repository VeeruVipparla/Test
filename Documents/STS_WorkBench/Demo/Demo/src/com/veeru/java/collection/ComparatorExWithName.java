package com.veeru.java.collection;

import java.util.Comparator;

public class ComparatorExWithName implements Comparator {
	
		
	

	public int compare(Object o1, Object o2) {
		if(o1 instanceof StringBuilder && o2 instanceof StringBuilder) {
		String s1=(String)o1.toString();
		String s2=(String)o2.toString();
		return s1.compareTo(s2);//asc
		//return -s1.compareTo(s2);//Desc order
		//return s2.compareTo(s1);//Desc
		}
		return 0;
		
		
	}

	

}
