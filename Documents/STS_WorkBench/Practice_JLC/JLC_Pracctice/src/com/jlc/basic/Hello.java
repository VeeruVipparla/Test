package com.jlc.basic;
//Lab1

public class Hello {

	boolean b1;
	byte b2;
	short s;
	char c;
	int i;
	long l;
	float f;
	double d;
	String str;
	Hello h;

	void show() {
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(s);
		System.out.println(c);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(str);
		System.out.println(h);
	}
}

class Lab1 {
	public static void main(String[] args) {
		Hello h = new Hello();

		h.show();
	}
}
