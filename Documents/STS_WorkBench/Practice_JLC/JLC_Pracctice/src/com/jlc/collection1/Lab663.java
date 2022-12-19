package com.jlc.collection1;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Lab663 {

	public static void main(String[] args) {
		Set s= Collections.singleton("JLC");
		
			System.out.println(s);
			
			s.add("Hello");
			List list= Collections.singletonList("JLC");
			System.out.println(list);
			list.add("Hello");

	}

}
