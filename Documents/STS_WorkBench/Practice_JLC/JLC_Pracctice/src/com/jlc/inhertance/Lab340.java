package com.jlc.inhertance;

public class Lab340 {
	public static void main(String[] args) {
		C d=new C(100,"200",300);
		d.show();
	}
}

class A {
	int a;
	A() {
		System.out.println("A-> D.C");
	}

	static {
		System.out.println("A-> S.B");
	}
	{
		System.out.println("A-> I.B");
	}
}

class B extends A {
	String b;
	B() {
		System.out.println("B-> D.C");
	}

	static {
		System.out.println("B-> S.B");
	}
	{
		System.out.println("B-> I.B");
	}
}

class C extends B {
	int c;
	C(int a, String b, int c) {
		super.a=a;
		super.b=b;
		this.c=c;
		System.out.println("C-> D.C");
	}

	static {
		System.out.println("C-> S.B");
	}
	{
		System.out.println("C-> I.B");
	}
	void show() {
		System.out.println("Value of 3 Integers::- "+a+"\t"+b+"\t"+c);
	}
}
