package com.java8.learn;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsTraversable {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,25,36,67);
		
		Object[] obj=list.toArray();
		
		System.out.println(obj.toString());
		System.out.println(obj);
		
		Object[] object = list.stream().toArray();
		
		for(Object i:object) {
			System.out.println("value :: "+i);
			
		}
		
		Stream<Integer> si=list.stream().limit(6);
		si.forEach(System.out::println);
		//si.forEach(System.out::println);//Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
		
		

	}

}
