package com.jlc.collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;

public class Lab662 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Srinivas");
		list.add("Anand");// Syntax error, insert ")" to complete Expression
		list.add("Vijay");
		list.add("Pavan");
		list.add(null);
		list.add(null);
		System.out.println(list);
		HashSet hs = new HashSet(list);
		System.out.println(hs);
		System.out.println("\n LIST to ENUMERATION");
		Enumeration enm = Collections.enumeration(list);

		while (enm.hasMoreElements())
			System.out.println(enm.nextElement());
		Vector v = new Vector();
		v.add(11);
		v.add(22);
		v.add(33);
		v.add(44);
		v.add(44);
		v.add(null);
		v.add(null);
		System.out.println("\n ENUMERATION to LIST");
		Enumeration enu = v.elements();
		List info = Collections.list(enu);
		System.out.println(info);

	}

}
