package com.jlc.inhertance;

public class Lab324 {

	public static void main(String[] args) {
		Hello1 h = new Hello1(10, 20);
		System.out.println("Show value of Hai::- " + h.a);
		System.out.println("Show value of Hai::- " + h.b);
		h.show();

		Hello1 h1 = new Hello1(30, 40);
		h.show();
		System.out.println("Show value of Hello1::- " + h1.a);
		System.out.println("Show value of Hello1::- " + h1.b);

	}
}

class Hai1 {
	// String b;
	int a;

}

class Hello1 extends Hai1 {
	int b;

	public Hello1(int a, int b) {
		super.a = a;
		this.b = b;
	}

	public void show() {
		System.out.println("a value is :: " + a + " b value is :: " + b);
	}
}
