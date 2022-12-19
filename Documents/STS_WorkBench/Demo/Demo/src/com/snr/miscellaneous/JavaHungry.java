package com.snr.miscellaneous;

	import java.util.*;
	import java.util.stream.*;
	//public class Java8 {
	    /*public static void main(String args[]) {
			
			 * List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15); Set<Integer>
			 * set = new HashSet(); myList.stream() .filter(n -> !set.add(n))
			 * .forEach(System.out::println);
			 */
	    	public class JavaHungry {
	    	    public static void main(String args[]) {
	    	            List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

	    	             myList.stream()
	    	                   .sorted()//(Collections.reverseOrder())
	    	                   .forEach(System.out::println);
	    	    }
	    	}
	    
	