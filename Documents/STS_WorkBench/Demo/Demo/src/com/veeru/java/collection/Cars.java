package com.veeru.java.collection;

import java.util.HashSet;

public class Cars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet str = new HashSet();
		str.add("BENZ");
		str.add("AUDI");
		str.add("LAMBORGINI");
		str.add("BENTLY");
		str.add("SUZIKI");

		System.out.println("how many objects are store in HS::" + str);
		System.out.println("size of the HS:" + str.size());
		System.out.println("remove the audi:" + str.remove("AUDI"));
		System.out.println("presnt length of HS:" + str);
		System.out.println("size of the HS" + str.size());
		System.out.println("add the folks wagon::" + str.add("FOLKS WAGON"));
		System.out.println("objects in HS" + str);
		str.clear();
		System.out.println(str);
		System.out.println("this is empty HS:" + str);

	}

}
