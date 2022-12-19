package com.interviewsession;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class Practice {

	public static void main(String[] args) {
	/*	
		    int [] a= {6,8,2,4,3,1,5,7,8} ;
		    SortedSet<Integer> sortedSet = new TreeSet<Integer>();
		    Arrays.stream(a).forEach(sortedSet::add);
		    sortedSet.remove(sortedSet.last());
		    System.out.println(sortedSet.last());
*/
		 int [] arr={1,2,3,4,3,2,5,2,5,3};
	        //Arrays.stream(arr).forEach(System.out::print);
	        Set<Integer>set = new HashSet(Arrays.asList(arr));;
	       for( Integer i:set) {
	    	   System.out.print(i+" ");
	       }
	}

}
