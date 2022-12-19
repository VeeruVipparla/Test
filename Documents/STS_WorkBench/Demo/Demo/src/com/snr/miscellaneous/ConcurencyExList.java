package com.snr.miscellaneous;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurencyExList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=new CopyOnWriteArrayList<>();
				//(List<Integer>) new ConcurencyExList();
		list.add(111);
		list.add(222);
		list.add(333);
		list.add(444);
		
		Iterator<Integer> it=list.iterator();
		
		while (it.hasNext()) {
			list.add(555);
			Integer  value=(Integer)it.next();
			
			System.out.println(value);
			
		}
		

	}

}
