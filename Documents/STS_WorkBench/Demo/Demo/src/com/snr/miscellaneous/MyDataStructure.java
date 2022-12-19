package com.snr.miscellaneous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyDataStructure {
	
	 static List<String> list = new ArrayList<String>();
	 

	    public static void add(String s) {
	        list.add(s);
	    }

	    /**
	     * Makes a defensive copy of the List and return it
	     * This way cannot modify the list itself
	     *
	     * @return List<String>
	     */
	    public static List<String> getList() {
	        return Collections.unmodifiableList(list);
	    }
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add("aaa");add("bbb");add("ccc");
		
		//List<String> list1=getList();
		
		System.out.println("getList() :: "+getList());
		
		

	}

}
