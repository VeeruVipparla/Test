package com.java8.learn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamEx_1 {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		list.add(33);
		list.add(22);
		list.add(11);
		list.add(44);
		list.add(44);
		list.add(33);
		
		System.out.println("List of elements"+list);
		
		Set<Integer> setV=new HashSet<>(list);
		
		System.out.println("setV elements"+setV);
		
		list.stream().filter(i-> i%2==0).distinct().sorted().collect(Collectors.toList()).forEach(System.out::println);
		
		Set<Integer>setvalue=list.stream().collect(Collectors.toSet());
		System.out.println("Setvalue objects::"+ setvalue);
		
		List<Integer> listVal=list.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println("Listvalue objects::"+ listVal);
		

	}

}


