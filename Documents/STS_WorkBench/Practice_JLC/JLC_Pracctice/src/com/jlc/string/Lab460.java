package com.jlc.string;

import java.util.Scanner;

public class Lab460 {

	public static void main(String[] args) {
		String s1="veera";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String");
		String s2=sc.nextLine();
		System.out.println("Re Enetr your String");
		String s3=sc.nextLine();
		String s4=s2.intern();
		String s5=s3.intern();
		System.out.println(s2==s3);
		System.out.println(s4==s5);
		System.out.println(s1==s5);
		
		
	}

}
