package com.java8.stream.operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedOrderJ8 implements Comparator<Integer> {
	//
	/*
	 * @Override public int compare(Object o1, Object o2) { Integer i1=(Integer)o1;
	 * Integer i2=(Integer)o2; return i1.compareTo(i2); }
	 */

	public int compare(Integer o1, Integer o2) {

		return o1.compareTo(o2);
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(60);
		list.add(100);
		list.add(90);
		list.add(50);
		list.add(40);

		Collections.sort(list, new SortedOrderJ8());

		for (Integer value : list) {
			System.out.println("value :: " + value);
		}

		System.out.println("==============================");

		List<Integer> groupByInteger = list.stream().sorted((Integer o1, Integer o2) -> o1.compareTo(o2))
				.collect(Collectors.toList());

		groupByInteger.forEach(System.out::println);

		User u1 = new User(123, "Rama");
		User u2 = new User(234, "Veeru");
		User u3 = new User(334, "SNRaju");

		List<User> listuser = new ArrayList<>();

		listuser.add(u1);
		listuser.add(u2);
		listuser.add(u3);

		System.out.println("===============reversed order ===============");
		List<User> sortedList = listuser.stream().sorted(Comparator.comparingInt(User::getUserId).reversed())
				.collect(Collectors.toList());

		// sortedList.forEach(System.out::println);
		for (User user : sortedList) {
			System.out.println("user id :: " + user.getUserId() + "\t user name " + user.getUserName());
		}

	}

}
