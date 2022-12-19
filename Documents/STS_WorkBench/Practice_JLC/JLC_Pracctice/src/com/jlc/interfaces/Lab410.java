package com.jlc.interfaces;

interface Interface1 {
	void m1();

	public abstract void m2();

	int A = 10;
	final int B = 20;

}

//class Hello extends Interface1 {}
// The type Interface1 cannot be the superclass of Hello; a superclass must be a
// class
 class Hello implements Interface1 {

	public void m1() {
System.out.println("Hello-> m1() "+A);
	}
	
	public void m2() {
		System.out.println("Hello-> m1() "+B);
	}
}

class Lab410 {
	public static void main(String[] args) { 
		Interface1 ref =null;
		ref = new Hello();
		ref.m1();
		ref.m2();
	//	System.out.println("Hello guys");
	
	}
}
