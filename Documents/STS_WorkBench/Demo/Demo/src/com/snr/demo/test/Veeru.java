package com.snr.demo.test;

public class Veeru {
	int a,b;

	public Veeru(int a,int b) {// used initializing instace variables.
		System.out.println("Constractor");
		this.a = a;
		this.b=b;
	}

	void display() {		
		System.out.println("Method Name ");
		System.out.println("a*b value are :: " + a*b +"\t"+"a+b value are :: "+ (a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Veeru veeru = new Veeru(10,20);
		// veeru.a=10;
		veeru.display();

		final String arr1[] = { "Raga", "Verru", "Lasya" };

		System.out.println(arr1.length);
		System.out.println(arr1.toString());

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		/*
		 * int arr2[]=new int[21]; System.out.println(arr2.length);
		 * 
		 * int arr3[]=new int[2]; System.out.println(arr3.length);
		 */

	}

}
