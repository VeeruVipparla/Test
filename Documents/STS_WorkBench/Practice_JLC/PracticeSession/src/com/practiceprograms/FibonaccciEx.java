package com.practiceprograms;

public class FibonaccciEx {
public static void main (String args[]) {
	int n1=0,n2=1, n3=10;
	int i=0;
	while(i<=n3) {
		System.out.print(n1+" ");
		int sum =n1+n2;
		n1=n2;
		n2=sum;
		i++;
	}
	
	}
}