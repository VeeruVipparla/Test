package com.jlc.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Lab597 {

	public static void main(String[] args) {
		Collection col=new ArrayList<>();
		System.out.println(col);
		System.out.println("Empty :"+col.isEmpty());
		System.out.println();
		col.add("Veeru");
		col.add("Sri");
		col.add("kanth");
		col.add("Uoha");
		col.add("They are one Family");
		System.out.println("List in collection::-"+col);
		System.out.println("Size :"+col.size());
		System.out.println("Empty :"+col.isEmpty());
		
		System.out.println(col.contains("Uoha"));//not case Sensitivity
		System.out.println(col.remove("kanth"));
		
		//col.clear();
		System.out.println(col);
		System.out.println(col.size());
		System.out.println("========================");
		Object[] arr=col.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			arr[i]="Veeru";
		}
		System.out.println(col);
		
		System.out.println("=======================");
		
		Iterator it=col.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
			if(obj.equals("Veeru")) 
				it.remove();
			}
		System.out.println(col);
		}
	}

