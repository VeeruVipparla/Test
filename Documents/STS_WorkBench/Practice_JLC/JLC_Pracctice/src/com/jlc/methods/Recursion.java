package com.jlc.methods;

class Hello7 {
	long factorial(int n) {
		if (n == 0 || n == 1)
			return 1;
		else
			return n*factorial(n-1);
			

	}
}

 class Recursion {

	public static void main(String[] args) {
		Hello7 h = new Hello7();
		int n = 5;
		long fac = h.factorial(n);
		System.out.println("Factorial id::" + fac);
	}

}
