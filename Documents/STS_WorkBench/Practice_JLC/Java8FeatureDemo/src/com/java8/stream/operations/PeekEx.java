package com.java8.stream.operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PeekEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<>();
        
		names.add("David");
		         
		names.add("Johnson");
		         
		names.add("Samontika");
		         
		names.add("Brijesh");
		         
		names.add("John"); 
		         
		names.add("David");
		         
	Object[] namesArr=	names.stream()
		        .filter(name -> name.length() > 5)
		        .peek(e -> System.out.println("Filtered Name :"+e))
		        .map(String::toUpperCase)
		        .peek(e -> System.out.println("Mapped Name :"+e))
		        .toArray();
	
	System.out.println("name of array:: "+Arrays.toString(namesArr));

	}

}
