package com.jlc.exception;

public class Lab562 {

	public static void main(String[] args) {
		System.out.println("Main() Started");
		try {
			Hello2 h=new Hello2();
			h.show();
			//new Hello2().show();
		} catch (Exception e) {
			System.out.println("\n catch block");
			System.out.println("Ex: " + e);
			System.out.println("Message: " + e.getMessage());
			System.out.println("Cause: " + e.getCause());
			System.out.println();
			e.printStackTrace();
		}
		System.out.println("Main() Completed");
	}
}

class Hello2 {
	void show() {
		System.out.println("show() begins");
		new A().m1();
		System.out.println("show() ends");

	}

}

class A {

	public void m1() {
		System.out.println("A->m1() begins");
		new B().m2();
		System.out.println("A->m1() ends");
	}

}

class B {

	public void m2() {
		System.out.println("B->m2() begins");
		new C().m3();
		System.out.println("B->m2() ends");
	}

}

class C {

	public void m3() {
		System.out.println("C->m3() begins");
		int x = 10 / 2;
		System.out.println("C->m3() ends");
	}

}