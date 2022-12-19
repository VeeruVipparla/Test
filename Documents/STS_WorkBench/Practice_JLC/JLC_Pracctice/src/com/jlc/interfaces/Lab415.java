package com.jlc.interfaces;

interface Inter1 {
	void m1();

	public abstract void m2();

	int A = 10;
	final int B = 20;

}

abstract class Hello1 implements Inter1 {
	public void m1() {
		System.out.println("Hello -> m1() " + A);
	}

	class Hai extends Hello1 {
		public void m2() {
			System.out.println("Hai -> m2() " + B);
		}

	}

	void m3() {
		System.out.println("Hai -> m3() ");
	}
}

public class Lab415 {

	public static void main(String[] args) {
		Inter1 ref = null;
		ref = new Hello1();
		ref.m1();
		ref.m2();

	}

}
