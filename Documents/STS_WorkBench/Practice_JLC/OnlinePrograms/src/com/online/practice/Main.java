package com.online.practice;

public class Main {
	int a=0;
	String b="23";
	try {
		a=2+Integer.parseInt(b);
		return a;
	}catch (Exception e) {
		System.out.println("not able to parse Int"+b);
	}
	finally {
		return b;
	}
	public static void main(String[] args) {
		
	}

}
