package com.jlc.miscellaneous;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashsetTest {

	public static void main(String[] args) {
		Set hs = new HashSet<>();
		hs.add(11);
		hs.add(13);
		hs.add(12);
		hs.add(34);
		hs.add(13);
		hs.add(12);
		hs.add(23);
		hs.add(0);
		hs.add(0);

		hs.add(45);
		hs.add(78);
		hs.add(null);

		System.out.println(hs);
		System.out.println(hs.contains(12));
		System.out.println(hs.toString());
		List list = new ArrayList(hs);
		System.out.println(list);
		Set ts=new TreeSet(list);
		System.out.println(ts);

	}

}
