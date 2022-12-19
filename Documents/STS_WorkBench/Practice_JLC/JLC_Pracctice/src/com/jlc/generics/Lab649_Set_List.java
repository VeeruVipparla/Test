package com.jlc.generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Lab649_Set_List {

	public static void main(String[] args) {
		System.out.println("Using Generics with List");
		List<String> list = new ArrayList<String>();
		list.add("Dell");
		list.add("Asus");
		list.add("Lenovo");
		list.add("Apple");
		list.add(null);
		// list.add(100);
		System.out.println(list);
		Set set=new HashSet(list);
		//Iterator<String> it = list.iterator();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			
		String str=	 it.next();
		//System.out.println(it.next());
		
			System.out.println(str);
			
		}

	}
}
