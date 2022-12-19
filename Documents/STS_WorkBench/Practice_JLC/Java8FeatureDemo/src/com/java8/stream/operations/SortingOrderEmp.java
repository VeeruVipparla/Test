package com.java8.stream.operations;

import java.util.Comparator;

public class SortingOrderEmp implements Comparator<Emp> {

	@Override
	public int compare(Emp e1, Emp e2) {
		return e1.getEname().compareTo(e2.getEname());
	}

	/*
	 * @Override public int compare(Object obj1, Object obj2) {
	 * 
	 * Emp e1=(Emp)obj1; Emp e2=(Emp)obj2;
	 * 
	 * return (int)e1.getEname().compareTo(e2.getEname()); }
	 */
}
