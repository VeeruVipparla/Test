package com.veeru.java.collection;


import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

import javax.xml.bind.JAXBException;

import org.xml.sax.SAXException;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

public class Fruits {

	public static void main(String[] args) throws JAXBException, Exception {
		// TODO Auto-generated method stub
		LinkedHashSet<String> fruits= new LinkedHashSet<>();	
		fruits.add("Banana");
		fruits.add("jackfruit"); fruits.add("Guava"); fruits.add("Apple");
		fruits.add("Mango");

		ShowFruits(fruits);
	}

	private static void ShowFruits(LinkedHashSet<String> fruits) throws Exception, JAXBException {

		Iterator<String> it=fruits.iterator();

		while (it.hasNext()) { String fruitName = (String) it.next();
		System.out.println("fruitName --> ::"+fruitName); }

		System.out.println("Ended fruits");

	}

}	









/*
 * fruits.add("jack"); fruits.add("Guava"); fruits.add("Apple");
 * fruits.add("Mango"); fruits.add("Pine apple"); fruits.add("Grapes");
 * fruits.add("Dragaon fruit"); fruits.add("Kivis"); fruits.add("Lemon");
 * fruits.add("Berry"); fruits.add("Papaya");
 * 
 * System.out.println("objects in HashSet::"+"\t"+"\n"+ fruits);
 * System.out.println("size of the HS::"+fruits.size());
 * System.out.println("remove the Berry::"+fruits.remove("Berry"));
 * System.out.println("remove the Lemon::"+fruits.remove("Lemon"));
 * System.out.println("objects in HashSet after remove::"+"\t"+"\n"+ fruits);
 * System.out.println("size of the HS::"+fruits.size());
 * System.out.println("containes the papaya::"+"\t"+ fruits.contains("papaya"));
 * System.out.println("is it empty::"+"\t"+ fruits.isEmpty());
 * System.out.println("Add the Water melon::"+"\t"+ fruits.add("Watermelon"));
 * System.out.println("size of HS::"+ fruits.size());
 * System.out.println("objects in HS::"+"\t"+"\n"+ fruits); fruits.clear();
 * System.out.println("How many objects in HS::"+ fruits);
 * 
 */










