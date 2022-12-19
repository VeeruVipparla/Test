package com.online.practice;

public class StringEx1 {

	public static void main(String[] args) {

		String s1 = new String("veeru");
		s1.concat("Software");
		System.out.println(s1.concat("116"));
		System.out.println(s1);
		StringBuffer sbf=new StringBuffer("Veeru");
		sbf.append("Software");
		System.out.println(sbf);
		
		String str="Mani";
		String str1="Mani";
		String str3=new String("Mani");
		String str2=new String("JAVA"); 
		System.out.println(str1==str3);
		System.out.println(str==str1);
		System.out.println(str1.equals(str2));
		System.out.println(str.hashCode());
		System.out.println(str3.hashCode());
		
	}

}
