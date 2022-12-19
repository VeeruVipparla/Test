package com.jlc.miscellaneous;

public class Calculate {

	int calculate(int x, int y) {
		return x / y;
	}

	int calculate(int x, int y, int z) {
		return x * y + z;

	}

	public static void main(String[] args) {
		Calculate c = new Calculate();
		System.out.println(c.calculate(40, 20));
		System.out.println(c.calculate(11, 22, 33));
	}
}