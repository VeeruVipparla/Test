package com.jlc.string;

public class Lab476 {
public static void main(String[] args) {
	String str="VeeruWinner";
//	String str1="VeeruLooser";
	int len=str.length();
	System.out.println("Str len::- "+len);
	String str1=str.toUpperCase();
	String str2=str.toLowerCase();
	System.out.println("Str 1::"+str1+"\n"+"Str 2::"+str2);
	System.out.println();
	System.out.println("===============");
	String s1="Hi, Welcome u to My world(This is veeru)My fav food u";
	String s2=s1.replace('u', 'a');
	System.out.println(s2);
	String s3=s1.replaceFirst("My", "Our");
	System.out.println(s3);
	String s4=s1.replaceAll("My", "your");
	System.out.println(s4);
	System.out.println(s1);
	String str5="In these Age we can't avoid the politics";
	System.out.println(str.indexOf('A'));
	//System.out.println(str.indexOf('A'));
	System.out.println(str5.substring(len-1));
	System.out.println(str5.substring(10, 17));
	
	
	
	
}
}
