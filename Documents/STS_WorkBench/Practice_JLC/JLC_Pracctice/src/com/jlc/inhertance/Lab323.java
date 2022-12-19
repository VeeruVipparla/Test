package com.jlc.inhertance;

public class Lab323 {

	public static void main(String[] args) {
		Hello h = new Hello();
		h.m1();
		h.m2();
	}

}

class Hai {
	
	int a = 100;
	

	void m1() {
		System.out.println("Hai-> m1::- " + a);
		System.out.println("Hai-> m2::- " + b);
	}
}

class Hello extends Hai {
	int b = 111;

	void m2() {
		System.out.println("Hello-> m2::- " + a);
		System.out.println("Hello-> m2::- " + b);
	}
}
