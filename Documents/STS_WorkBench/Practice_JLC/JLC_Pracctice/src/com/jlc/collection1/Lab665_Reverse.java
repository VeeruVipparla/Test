package com.jlc.collection1;

import java.util.ArrayList;
import java.util.Collections;

public class Lab665_Reverse {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Bahubali");
		list.add("Sahoo");
		list.add("Salar");
		list.add("Chatrapthi");
		list.add("Darling");
		list.add("MR.perfect");
		System.out.println("\n Reverse");
		Collections.reverse(list);
		System.out.println(list);
		
		System.out.println("\n Rotate(2)");
		Collections.rotate(list, 2);
		System.out.println(list);
		System.out.println("\n Rotate (-3)");
		Collections.rotate(list, 3);
		System.out.println(list);
		System.out.println("\n Shuffle");
		for (int i = 0; i <6; i++) {
			Collections.shuffle(list);
			System.out.println(list);
		}
	}

}

