package com.jlc.exception;

public class CheckedEx {

	public static void main(String[] args) {
		System.out.println("--Main Started--");
		CheckedEx c = new CheckedEx();
		Object obj = c.clone();
		int x=10/0;
		System.out.println("Main completed");

	}

}
