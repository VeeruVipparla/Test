package com.jlc.interfaces;

class Hello3 implements Interface2, Interface3 {
	public void m1() {
		System.out.println("Hello->m1() ");
	}

	public void m2() {
		System.out.println("Hello->m2() ");
	}

	public void m3() {
		System.out.println("Hello->m3() ");
		
		System.out.println(Interface2.A);
		System.out.println(Interface3.A);
		System.out.println();
		System.out.println(B);
		System.out.println(C);
	}
}

public class Lab418 {
	public static void main(String[] args) {
		Hello3 h = new Hello3();
		h.m1();
		h.m2();
		h.m3();
	}
}
