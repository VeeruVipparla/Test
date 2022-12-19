package com.jlc.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Lab601 {

	public static void main(String[] args) {
		Collection col=new ArrayList();
		col.add("India");
		col.add("Pakisthan");
		col.add("Srilanka");
		col.add("Bangladesh");
		
		System.out.println(col+"\t"+col.size());
		Collection col2=new ArrayList();
		col2.add("Australia");
		col2.add("NewZeland");
		col2.add("SouthAfrica");
		col2.add("West Indies");
		
		System.out.println(col2+"\t"+col2.size());
		col.add(col2);
		col.addAll(col2);
		System.out.println(col.size());
		System.out.println(col);
		
		Object[] arr=col.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			//arr[i]="Veeru";
		}
		System.out.println(col);
		
		System.out.println("=================");
		
		Iterator it=col.iterator();
		while (it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
			
		}
		
	}

}
