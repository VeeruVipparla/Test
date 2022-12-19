package com.jlc.literals;

public class Lab39_StringLit {

	public static void main(String[] args) {
		String str = "VEERU";
		String str1 = null;
		String str2 = new String("veeru");
		String str3 = "";
		String dir1="D:\"new\"test\"batch";
		String dir2="D:\\new\\test\\batch";

		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(dir1);
		System.out.println(dir2);
		System.out.println("===================");
		int x = str.length();
		int y = str.hashCode();
		int z = str2.hashCode();
		String a = str2.intern();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);

	}
}