package com.online.practice;

public class SuperClass {

	void method(){
		System.out.println("Superclass Existed");
	}
}

class SubClass extends SuperClass {
	void method(){
		System.out.println("Subclass Existed");
	}

	public static void main(String[] args)  {
		SuperClass s = new SubClass();
		s.method();
	}

}
