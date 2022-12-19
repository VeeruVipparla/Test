package com.jlc.stringbuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab506 {
	public static void main(String[] Args) {
		String str = "A";
		String str1 = new String("A");
		StringBuilder sb = new StringBuilder("A");
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(sb.hashCode());
		/*
		 * Integer[] a=new Integer[] {10,20,30}; List<Integer> list=Arrays.asList(a);
		 * System.out.println(" Integer list :: "+list);
		 * 
		 * String str11[]= new String[] {"sone","stwo"};
		 * 
		 * List<String> listStr=Arrays.asList(str11);
		 * System.out.println("list Str ::"+listStr);
		 */
		System.out.println("================");
		StringBuilder sb2 = new StringBuilder("A");
		StringBuilder sb3 = new StringBuilder("A");
		System.out.println(sb2.equals(sb3));
		String str2 = sb2.toString();
		String str3 = sb3.toString();

		System.out.println(str2.equals(str3));

	}
}
