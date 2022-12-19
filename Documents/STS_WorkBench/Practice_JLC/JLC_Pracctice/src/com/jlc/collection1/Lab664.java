package com.jlc.collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab664 {

	public static void main(String[] args) {
		List list=new ArrayList();
		//list.add("Pawan");
		list.add("Pawan");
		list.add("MalluArjun");
		list.add("N.T.R");
		list.add("Zenco");
		list.add("RamCharan");
		list.add("Mahesh");
		
		
		System.out.println("\n Replacing SD with Viswak ");
		Collections.replaceAll(list, "Pawan", "BalaKrishna");
		System.out.println(list);
		
		Object max=Collections.max(list);
		System.out.println("\nMAX OBJ : "+max);
		Object min=Collections.min(list);
		System.out.println("\nMIN OBJ : "+min);
		
		System.out.println("\n Repalce all With Raviteja ");
		Collections.fill(list, "Raviteja");
		System.out.println(list);
	}

}
