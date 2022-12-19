package com.jlc.string;

public class Lab489 {

	public static void main(String[] args) {
		String str="JLCINDIA";
		int len=str.length();
		System.out.println(str);
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(5));
		System.out.println();
		 
		
		for (int i1=0; i1<len; i1++) {
			System.out.println(i1+"\t"+str.charAt(i1));
		}
		System.out.println("===============");
		for (int i=7; i<=len; --i) {
			System.out.println(i+"\t"+str.charAt(i));
			//java.lang.StringIndexOutOfBoundsException
		}
	}
	

}
