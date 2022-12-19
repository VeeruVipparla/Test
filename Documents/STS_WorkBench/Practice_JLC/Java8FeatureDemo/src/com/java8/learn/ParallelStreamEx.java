package com.java8.learn;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class ParallelStreamEx {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		//"Apple", "Banana", "Gauva",
		
		list.add("Grape");
		list.add("Banana");
		list.add("Gauva");
		list.add("Apple");
		list.add("Papaya");
		
		
		list.stream().filter((String fruit)-> fruit.equals("Apple")).forEach(System.out::println);
		
		//name.length() > 5
		
		list.parallelStream().filter((String fruit)-> fruit.length()>5).skip(1).forEach(System.out::println);
	
	
		List<String> names = new ArrayList<>();
        
		names.add("David");
		         
		names.add("Johnson");
		         
		names.add("Samontika");
		         
		names.add("Brijesh");
		         
		names.add("John"); 
		         
		//Normal Execution
		         
		names.stream().filter((String name) -> name.length() > 5).skip(1).forEach(System.out::println);
		         
		//Parallel Execution
		         
		names.parallelStream().filter((String name) -> name.length() > 5).skip(1).forEach(System.out::println);

	
	}

}
