package com.jlc.methods1;

public class Lab308 {

	public static void main(String[] args) {
		Hai hai = new Hai();
		hai.a = 100;
		Hello1 hello = new Hello1();
		System.out.println("Main begin:" + hai.a);
		hello.m1(hai);
		System.out.println("Main ends:" + hai.a);
	}

}

class Hello1 {
	void m1(Hai hai) {
		System.out.println("m1 begin :: " + hai.a);
		hai.a = hai.a + 10;
		System.out.println("m1 ends :" + hai.a);
	}
}

class Hai {
	int a;

}