package com.jlc.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Lab603 {
@SuppressWarnings("unchecked")
public static void main(String []args) {
	Collection col=new ArrayList();
	col.add("Bnglr");
	col.add("AP");
	col.add("Chennai");
	
	Collection col2=new ArrayList();
	col2.add(100);
	col2.add(200);
	col2.add(300);
	
	Collection col3=new ArrayList();
	col3.add("Veeru");
	col3.add("Mani");
	col3.add("Vali");
	System.out.println(col+"\n"+col2+"\n"+col3);
	col.addAll(col2);
	col.addAll(col3);
	System.out.println(col.containsAll(col2));
	System.out.println(col.containsAll(col3));
	System.out.println(col.removeAll(col2));
	col.clear();
	System.out.println(col);
	System.out.println(col.retainAll(col2));
	System.out.println(col);
	System.out.println(col2);
}

}
