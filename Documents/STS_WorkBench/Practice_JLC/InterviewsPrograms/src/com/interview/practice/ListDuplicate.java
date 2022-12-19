package com.interview.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDuplicate {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,2);
		List<Integer> listofDuplicates = new ArrayList<Integer>();
		for (Integer i : list) {
			if (!listofDuplicates.contains(i)) {
				listofDuplicates.add(i);
			}

		}
		
		System.out.println(listofDuplicates);
		
		
		List<String>str=Arrays.asList("v","f","c","V","v","b","c","d");
		List< String >listDupStrings=new ArrayList<>();
		for(String s:str) {
			if(!listDupStrings.contains(s)) {
				listDupStrings.add(s);
			}
		}
		System.out.println(listDupStrings);
	}
}



