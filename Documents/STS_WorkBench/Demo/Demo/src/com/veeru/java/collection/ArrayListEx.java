package com.veeru.java.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		ListIterator<Integer> listitr= list.listIterator();


		while (listitr.hasNext()) {
			Integer value = (Integer) listitr.next();
			System.out.println(" value is "+value);

			System.out.println("hasPrevious() "+listitr.hasPrevious());
			System.out.println("previousIndex() "+listitr.previousIndex());
		}

		/*
		 * if(listitr.hasPrevious()){
		 * System.out.println("hasPrevious element"+listitr.hasPrevious()); }
		 * 
		 * if(listitr.previous() != null) {
		 * System.out.println("previous element is :: "+listitr.previous()); }
		 */
		/*listitr.previous();
	listitr.hasPrevious();
	listitr.previousIndex();*/
	}

}
