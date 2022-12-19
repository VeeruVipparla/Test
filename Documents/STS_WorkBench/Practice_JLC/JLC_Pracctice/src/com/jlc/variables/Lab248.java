package com.jlc.variables;

public class Lab248 {

	public static void main(String[] args) {
		Hello3 h = new Hello3();

		System.out.println("Main :" + h.a);
		System.out.println("---Main in Lab-----");
	}
	static {
	System.out.println("Static not block ");

}
}
class Hello3 {
	int a1, a = 10;
	int b;
	static {

		System.out.println("============Static block======");
	}
}
