package com.practiceprograms;

class C {
	void m1() {
		System.out.println("A class");
	}
}

class B extends C {
	void m2() {
		System.out.println("B class");
	}
}

public class DemoTest {

	public static void main(String[] args) {

		B b=new B();
//		B b1=new C();// cannot convert from C to B
		C b2=new B();
		C b3=new C();
		b.m1();
		b.m2();
		b2.m1();
		b3.m1();
	
		
	}

}
