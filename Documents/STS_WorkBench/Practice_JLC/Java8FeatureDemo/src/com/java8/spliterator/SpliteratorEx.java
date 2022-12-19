package com.java8.spliterator;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorEx {

	public static void main(String[] args) {
		String[] str = new String[] { "Veeru", "Rama", "Raju", "Spandana", "Lasya", "Rutvik" };
		Spliterator<String> str1 = Arrays.spliterator(str);
		str1.tryAdvance(System.out::println);
		str1.forEachRemaining(System.out::println);
		System.out.println();
		System.out.println("===========================");
		List<String> listString = Arrays.asList("1","2","3","4");
//India", "England", "Australlia", "West Indies", "SouthAfrica",
//				"Bangladesh","Pakisthan","New Zeland"
		Spliterator<String> splitList=listString.spliterator();
/*		Spliterator<String> anotherTrySplit=splitList.trySplit();
		System.out.println("From 1st Spliterator");
		System.out.println("------------------");
		splitList.forEachRemaining(System.out::println);
		
		System.out.println();
		System.out.println("From 2nd Spliterator");
		System.out.println("---------------------");
		anotherTrySplit.forEachRemaining(System.out::println);
*/		
		System.out.println(splitList.estimateSize());
		splitList.tryAdvance(System.out::println);
		System.out.println(splitList.estimateSize());
		System.out.println(splitList.hasCharacteristics(16464));
//		System.out.println(splitList.getComparator());
		
		
		
	}

}

