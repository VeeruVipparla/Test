package com.jlc.generics;

import java.util.ArrayList;
import java.util.List;

public class Lab653 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1234);
		list.add(111);
		list.add(444);
		list.add(8974);
		showElement(list);
		ArrayList<Float>list1=new ArrayList<>();
		list1.add(7474.857F);
		list1.add(372.347F);
		list1.add(231.46F);
		showElement(list1);
		ArrayList<String> list2=new ArrayList<>();
		list2.add("veeru");
		list2.add("from");
		list2.add("Abr");
//		showElement(list2);
	}
static void showElement(List <?extends Number> list) {//v
	for( Number num:list) {
		System.out.println(num+",");
	}
	System.out.println("\n");
}
}
