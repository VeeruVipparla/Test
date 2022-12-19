package com.java8.stream.operations;

import java.util.stream.Stream;

public class StreamOfEx {

	public static void main(String[] args) {
		
		System.out.println(Stream.empty().count());
		/*
		 * Emp e=new Emp(); Emp e1=new Emp();
		 */
		Stream<Emp> t=Stream.of(new Emp());//1
		Stream<Emp> t2=Stream.of(new Emp(),new Emp());//2
		System.out.println("emp object "+t.count()+"\t emp2 objects   :: "+t2.count());
		//System.out.println(t.count());
		
		/*Stream<Integer> t=Stream.of(12,14,15,27,23,4);
		//System.out.println(t.count());
		t.forEach(System.out::println);*/
	}

}
