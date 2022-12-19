package com.jlc.controlstatements;

public class Lab134_If_Else {

	public static void main(String[] args) {

		if (false)
			System.out.println("IF BLOCK 1");
		System.out.println("Hello guys");

		if (true)
			System.out.println("IF BLOCK 1");
		System.out.println("Hai guys");
		System.out.println();
		int a = 99;
		if (a == 99) {

			int c = 12;
			System.out.println(c);
			System.out.println(a);
		}
		System.out.println(a);
		System.out.println("==================");
		int b = 88;
		if (b == 99)
			System.out.println("value is 88");

		int d = 42;
		if (d / 7 == 6)// 13 Divides left-hand operand by right-hand operand and returns remainder.
			System.out.println("value is EVEN");
		else
			System.out.println("value is ODD");

		System.out.println();
		System.out.println("=====================");
		int a1 = 1;
		if (++a1 == 0)
			System.out.println("ZERO");
		else if (++a1 == 2)
			System.out.println("ONE");
		else
			System.out.println("Not matching");
		System.out.println(a1);
		System.out.println();
		System.out.println("=============");

		int a2 = 10;
		int b2 = 20;
		int c2 = 15;
		int max = 0;
		if (a2 > b2 && b2 > c2)
			max = a2;
		else if (b2 > a2 || b2 > c2)
			max = b2;
		else
			max = c2;
		System.out.println("Maximum value is" + max);

	}
}
