package com.snr.miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		//int[] a={5, 3, 4, 1, 3, 7, 2,3,1, 9, 9, 4,1};
		//List<Integer> list1=(List<Integer>)Arrays.asList(a);
		
		List<Integer> list=Arrays.asList(5, 3, 4, 1, 3, 7, 2,3,1, 9, 9, 4,1);
		
		//Set<Integer> s=new HashSet<>(list);
		
		//System.out.println(s);//[5,3,4,1....]
		
		
		
		List<Integer> list1= Arrays.asList(1,1,2);
		
		List<Integer> listDuplicateFind=new ArrayList<>();
		
		for(Integer i: list1) {
			if(!listDuplicateFind.contains(i)) {
				listDuplicateFind.add(i);
			}
			
		}
	
		System.out.println(listDuplicateFind);
		

	}

}
