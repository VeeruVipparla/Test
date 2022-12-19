package com.jlc.controlstatements;

public class Lab153_Looping {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			System.out.println(i);
	
		
			System.out.println("===================");

		}
		for (int i = 0; i <= 20; i++) {
			if (i % 2 != 0)
				System.out.println(i);

		}
		int n = 5;
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "=" + n * i);
			System.out.println("===================");
		}
		for (int i = 1; i <= 10; i++) {
			int a=111;
			a-=i;
			
			System.out.println(i + "\t" + a);
			
			
			System.out.println("===============");
			
		}
	}
	
}
