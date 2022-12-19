package com.jlc.variables;

public class Lab238_STblk {
	static int a1 = 34;

	public static void main(String[] args) {
		Hello1 h = new Hello1();
		System.out.println("Main::" + h.d);
		int a = 17;

		System.out.println(a);
		System.out.println(a1);
		System.out.println(Hello1.b);
	}

}

class Hello1 {
	static int b = 22;
	static int c = 13;
static	int d = 33;
	{
		System.out.println("Initialized::" + d);

	}
}