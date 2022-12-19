package com.jlc.collection;

import java.util.ArrayList;
import java.util.List;

public class Lab608 {

	public static void main(String[] args) {
		 List list=new ArrayList();
		 list.add("june");
		 list.add("july");
		 list.add("Aug");
		 list.add("Sep");
		 list.add("Oct");
		 list.add("Nov");
		 list.add("Sep");
		 
		 System.out.println(list);
		 int x=list.indexOf("Sep");
		 System.out.println(x);
		 
		 int y=list.lastIndexOf("Sep");
		 System.out.println(y);
		 
	}

}
