package com.jlc.string;

public class Lab502 {

	public static void main(String[] args) {
		String str="AB";
		String str1="AB";
		String str3="Veeru";
		String str2=new String ("AB");
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str==str2);
		System.out.println(str==str1);
	}

}
