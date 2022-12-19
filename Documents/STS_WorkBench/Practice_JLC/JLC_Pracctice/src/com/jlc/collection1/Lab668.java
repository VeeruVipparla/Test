package com.jlc.collection1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab668 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Veeru");
		list.add("Mani");
		list.add("Satish");
		list.add("Rambabu");
		list.add("Nasar");
		list.add("Baji");

		Collection synList = Collections.synchronizedCollection(list);
		System.out.println("synList \t"+synList);
		System.out.println("List \t"+list);
		
		Collection unModiList =Collections.unmodifiableCollection(list);
		System.out.println("unModiList \t"+unModiList);
		System.out.println("Modifying List");
		
		list.add("Dileep");
		System.out.println("List\t"+list);
		System.out.println("unModiList \t"+unModiList);
		
		unModiList.add("Ravi");
		System.out.println("unModiList \t"+unModiList);
	}

}
