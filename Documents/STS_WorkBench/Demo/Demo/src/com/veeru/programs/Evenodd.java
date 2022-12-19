package com.veeru.programs;

import java.util.Scanner;

public class Evenodd {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an integer");
	int no = sc.nextInt();
	if (no%2==0)
	{
		System.out.println("Number is EVEN");
	}
	else 
	{
		System.out.println("Number is ODD");
	}
}
}
