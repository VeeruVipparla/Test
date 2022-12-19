package com.java.pract_progrms;

import java.util.HashMap;
import java.util.Map.Entry;

public class TestingImmutability {

	public static void main(String[] args) {
		int i = 6;
	    String s = "!am@John";
	    HashMap<String, String> h = new HashMap<String, String>();

	    h.put("Info1", "!am@John");
	    h.put("Inf02", "!amCrazy6");


	    IamImmutable imm = new IamImmutable(i, s, h);

	    h.put("Inf02", "!amCraxy7");

	    System.out.println(imm.getS() + imm.getI());
	    for (Entry<String, String> entry: h.entrySet())
	      System.out.println(entry.getKey() + " --- " + entry.getValue());

	}

}
