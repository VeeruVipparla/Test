package com.jlc.stringbuilder;

public class Lab504 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Veeru");
		System.out.println("Capacity::" + sb.capacity());
		System.out.println("Length::" + sb.length());
		sb.trimToSize();
		System.out.println("Capacity::" + sb.capacity());
		System.out.println("Length::" + sb.length());
		String str = "Veeru";
		StringBuilder sb1 = new StringBuilder("Veeru");
		System.out.println(str.contentEquals(sb1));// true
		System.out.println(str.equals(sb1));// false
	}

}
