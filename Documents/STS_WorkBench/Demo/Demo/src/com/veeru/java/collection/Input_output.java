package com.veeru.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class Input_output {
	
	public static void main(String[] args) {
		LinkedHashSet s=new LinkedHashSet();//Node Data Node  Node data Node 
		// duplicate is not allowed, It's not insert order
		s.add(10);
		s.add(10);
		s.add(20);
		s.add(30);
		
		System.out.println(s);
		
		List list= new ArrayList();//It's insert order , duplicate allowed.
		list.add(10);
		list.add(10);
		list.add(40);
		list.add(30);
		list.add(20);
		
		System.out.println("list :: "+list);
		
		
		
		
	}

}
