package com.jlc.miscellaneous;

public class InhertanceEx {

	public static void main(String[] args) {
		Hello1 h = new Hello1(100, 200);
		Hello1 h1 = new Hello1(300, 400);
		h.show();
		h1.show();
	}
}

class Hai1 {
	int a;
}

class Hello1 extends Hai1 {
	int b;

	public Hello1(int a, int b) {
		super.a = a;
		this.b = b;
	}

	void show() {
		System.out.println("Value of A::- " + (a + b) + "\n" + "Value of B::- " + b);
	}
}