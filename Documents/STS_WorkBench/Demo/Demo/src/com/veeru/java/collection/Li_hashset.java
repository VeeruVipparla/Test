package com.veeru.java.collection;

import java.util.Iterator;
import java.util.LinkedList;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

public class  Li_hashset{
	public static void main(String[] args) {

		LinkedList inte=new LinkedList();

		inte.add(12);
		inte.add(34);
		inte.add(54);
		//inte.add(null);//linkedlist can allow the duplicate values;
		inte.add(12);
		System.out.println(inte);

		Iterator itr= inte.iterator();
		Object obj[]=inte.toArray();
		int s=0;
		for(int i=0; i<obj.length; i++)
		{
			Integer io= (Integer) obj [i];
			int x=io.intValue();
			s=s+x;
		}
		System.out.println("sum using toArray()="+s);
		inte.addFirst(new Integer(5));
		inte.addFirst(new Integer(6));
		System.out.println("contents of ll="+inte);
		System.out.println("size of the ll="+inte.size());

		Iterator itr1=inte.iterator();
		int s1=0;
		while (itr1.hasNext()) {
			Object obj1=itr1.next();
			Integer io1=(Integer) obj1;
			int x1=io1.intValue();
			s1=s1+x1;
			System.out.println("sum using iterator()="+s1);}

		/*
		 * java.util.ListIterator litr=inte.listIterator(); while (litr.hasNext()) {
		 * Object obj2=litr.next(); System.out.println(obj2+","); }
		 * System.out.println("\n"); while (((java.util.ListIterator)
		 * litr).hasPrevious())
		 * 
		 * { Object obj3=litr.next(); System.out.println(obj3+","); }
		 * System.out.println("\n"); Object obj4=inte.get(2); System.out.println(obj4);
		 */





	}
}






