package com.jlc.miscellaneous;

public class StaticEx {
	static int a = 10;
	static

	{
		System.out.println("veera" + a);
	}

	static {
		System.out.println("I am veeru");
	}

	public static void main(String[] args) {

		System.out.println("I am not veeru ");
		System.out.println(a);

	}

}
