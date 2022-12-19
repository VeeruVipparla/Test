package com.practiceprograms;

interface Demo1 {
	int a = 1;
	int b = 9;

	default void m1() {
		System.out.println(a * b);
	}

	default void m2() {
		System.out.println(a + b);
	}

	void m3(int a, int b);
}

public class Test1 implements Demo1 {
	public static void main(String[] args) {
		Test1 t = new Test1();
		int a = 10;
		int b = 20;
		t.m1();
		t.m2();

		System.out.println(a * b);
		System.out.println();
	}

	@Override
	public void m3(int a, int b) {

	}

}
