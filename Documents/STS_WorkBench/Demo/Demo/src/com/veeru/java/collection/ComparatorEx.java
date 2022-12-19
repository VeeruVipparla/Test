package com.veeru.java.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet	treeSetObj=new TreeSet(new ComparatorExWithName());
		treeSetObj.add(new StringBuilder("Rama"));
		treeSetObj.add( new StringBuilder ("Veeru"));
		treeSetObj.add(new StringBuilder ("Nag"));
		treeSetObj.add(new StringBuilder ("Lasya"));
		treeSetObj.add(new StringBuilder ("Lasya"));
		
		//Collections.sort(list, new ComparatorExWithName());
		
		Iterator it = treeSetObj.iterator();

		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);

		}
		

	}

}
