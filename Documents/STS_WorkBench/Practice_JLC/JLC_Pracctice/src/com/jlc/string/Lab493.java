package com.jlc.string;

public class Lab493 {

	public static void main(String[] args) {
		char ch[]= {'V','e','e','r','u','v','i','p','p','r','l','a'};
		byte b[]= {65,66,67,97,97,100,97};
		String str=new String (ch);
		String str1=new String (b);
		System.out.println("str::"+str);
		System.out.println("str1::"+str1);
		System.out.println("================");
		String s1=new String (ch,4,6);
		String s2=new String (b,2,4);
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
