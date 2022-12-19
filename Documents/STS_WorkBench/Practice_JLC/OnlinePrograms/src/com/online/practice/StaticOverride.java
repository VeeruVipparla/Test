package com.online.practice;

class Base {
	static void display() {
		System.out.println("Static or Class method");
	}

	void print() {
		System.out.println("Non static or instance method");
	}
}

class Derived extends Base {
	static void display() {
		System.out.println("Static  method");
	}

	void print() {
		System.out.println(" Instance method");
	}
}

public class StaticOverride {
	public static void main(String[] args) {
		Base obj1 = new Derived();
		obj1.display();
		obj1.print();

	}

}
