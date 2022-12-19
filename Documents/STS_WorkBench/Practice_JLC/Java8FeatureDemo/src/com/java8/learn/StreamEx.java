package com.java8.learn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(40);
		list.add(30);
		list.add(1);
		list.add(20);
		list.add(50);list.add(50);list.add(50);list.add(50);
		list.add(5);list.add(9);
		list.add(16);
		
		System.out.println("list  values :: "+list);
		
		Set<Integer> setV=new HashSet<>(list);
		
		System.out.println("setV  :: "+setV);
		
		List<Integer> listV=new ArrayList<>(setV);
		
		System.out.println("listV :: "+listV);
		
		
		
		
		Set<Integer> setValue=list.stream().collect(Collectors.toSet());
		System.out.println("setValue objects :: "+setValue);
		
		
		list.stream().filter(i-> i%2==0).distinct().sorted().collect(Collectors.toList()).forEach(System.out::println);;
		
		
		//listValues.forEach(System.out::println);
		//System.out.println("\n listValues objects :: "+listValues);
		
		Optional<Integer> p=Optional.of(10);
		
		
		//Return {@code true} if there is a value present, otherwise {@code false}.
		if(p.isPresent()) {
			System.out.println("value is present   :: "+p);
		}
	 
		
		
		

	}

}
