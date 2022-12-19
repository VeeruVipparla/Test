package com.java.pract_progrms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringDuplicate_Freq {

	public static void main(String[] args) {
		String str="ababcd";
		List<String>list=Arrays.asList(str.split(""));
		Set<String> uniqueWords=new HashSet<String>(list);
		System.out.println(uniqueWords);
		for(String word: uniqueWords) {
			System.out.println(word+":"+Collections.frequency(list, word));
		}
	}        
}
