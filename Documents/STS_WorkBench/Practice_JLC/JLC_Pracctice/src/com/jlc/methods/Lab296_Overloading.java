package com.jlc.methods;

import com.sun.javafx.css.CalculatedValue;

//Lab296_Overloading
public class Lab296_Overloading {

	public static void main(String[] args) {

		Hello3 h = new Hello3();
		int a = h.add(10, 20);
		System.out.println(a);

	}

}

class Hello3 {
	int add(int a, int b) {
		System.out.println("add(int,int)");
		return a + b;

	}

	void add1(int a, int c) {
		System.out.println("add(int,int)");

	}
}
