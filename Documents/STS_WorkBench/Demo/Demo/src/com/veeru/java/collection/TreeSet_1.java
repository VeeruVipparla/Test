package com.veeru.java.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_1 {
	public static void main(String[] args) {
		
		TreeSet food= new TreeSet ();
		
		food.add("Biryani");
		food.add("Gogurra");
		food.add("Sankati");
		food.add("Sambar");
		food.add("Roty");
		food.add("Roty");
		food.add("Sambar");//treeSet is cannot allow the duplicate values
		
		System.out.println("Contents of Treeset::"+"\n"+food);
		System.out.println("size of the TreeSet::"+food.size());
		System.out.println("hashcod of the TreeSet::"+food.hashCode());
		System.out.println("Adding the Panipuri::"+food.add("Panipuri"));
		System.out.println("list of items after adding::"+food);
		
		Iterator itr= food.iterator();
		
		
		  while(itr.hasNext()) { Object obj=itr.next(); System.out.println(obj); }
		 
		for(int i=0; i<3; i++) {
			System.out.println("list of the items::"+food);
		
		
		
		}
	}
}
		
	

	
		
	

