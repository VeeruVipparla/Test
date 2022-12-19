package com.jlc.methods;

public class Lab292 {

	public static void main(String[] args) {
		Helloo h=new Helloo();
		System.out.println(h.isDigit('A'));
		System.out.println(h.isDigit('8'));
	}

}

class Helloo {
	boolean isDigit(char ch) {
		System.out.println("isDigit():" + ch);
		if (ch >= 48 && ch <= 57)
			return true;
		else
			return false;

	}

}