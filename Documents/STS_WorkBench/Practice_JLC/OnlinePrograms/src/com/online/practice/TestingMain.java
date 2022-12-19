package com.online.practice;

class GrandParent {
	void print() {
		System.out.println("Grand Parent print");
	}
}

class Parent extends GrandParent {
	void show() {
		
		System.out.println("Parent Print");
	}
}

class Child extends Parent {
	void Display() {
		super.show();
		System.out.println("Child Print");
	}

}

public class TestingMain {

	public static void main(String[] args) {

		Child c = new Child();
		c.print();
		c.Display();
		c.show();
	}

//}
}
