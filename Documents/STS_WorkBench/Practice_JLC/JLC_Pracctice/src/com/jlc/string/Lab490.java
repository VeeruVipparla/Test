package com.jlc.string;

public class Lab490 {

	public static void main(String[] args) {
		String str="JLCINDIA";
		int len=str.length();
		System.out.println(str.substring(3,len));
		System.out.println(str.substring(3,len-1));
		System.out.println(str.substring(0,len));
		System.out.println(str.substring(1,6));
		System.out.println(str.substring(3,9));
	}

}
