package com.jlc.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Lab606 {

	public static void main(String[] args) {
		List list=new ArrayList<>();
		list.add("Veeru");
		list.add("raju");
		list.add("123");
		list.add("Akhil");
		list.add("Gayathri");
		list.add("987");
		
		
		List list2=list.subList(1, 5);
		System.out.println(list);
		System.out.println("============");
		System.out.println(list2);
		
		list.add(1, "Rama");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		
		Set set=new HashSet(list);
		
		System.out.println(set);
		Set tset=new TreeSet(set);
		System.out.println(tset);
		System.out.println("==========");
		Object obj=list.get(5);
		System.out.println(obj);

	}

}
