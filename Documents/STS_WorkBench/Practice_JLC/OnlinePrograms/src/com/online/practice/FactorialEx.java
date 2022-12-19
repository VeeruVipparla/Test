package com.online.practice;

public class FactorialEx {
	public static int factorial(int n) {
		if(n==0)
		return 1;
		else
		return(n*factorial(n-1));	
	}

	public static void main(String[] args) {
/*		int fact=1;
		int number=5;
		for(int i=1; i<=number; i++) {
			fact=fact*i;
			System.out.println(fact);
			
		}
		System.out.println(fact);
*/
		int fact=1;
		int num=4;
//		fact=factorial(num);
		
		System.out.println(factorial(num));
	}

}
