package com.java8.learn;

import java.io.StringBufferInputStream;
import java.util.stream.IntStream;

public class PipelineOperations {

	public static void main(String[] args) {
		int[] a = new int[] {1,8,6,4,3,2,1};
		int[] a1 ={1,8,6,4,3,2,1};
		
		IntStream.of(1,8,6,4,3,2,1).filter(i-> i%2==0).forEach(System.out::println);;
		System.out.println("-----------------");
		
		IntStream.of(a1).filter(i-> i%2==0).forEach(System.out::println);;
		
		System.out.println("================");
		IntStream.of(new int[] {4, 7, 1, 8, 3, 9, 7}).filter((int i) -> i > 5).distinct().forEach(System.out::println);

		
		
	//	String[] str=new String[] {"Apple", "Banana", "Gauva","Grape"};
		
		
		

	}

}
