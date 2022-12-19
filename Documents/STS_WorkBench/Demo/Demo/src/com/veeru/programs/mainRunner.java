package com.veeru.programs;

import java.util.Scanner;

class mainRunner{
	

public static void main(String args[]) {
	Scanner scn= new Scanner(System.in);
	System.out.println("Enter an integer valve");
	int no = scn.nextInt();
	if(no>=0)
		System.out.println(no+"is positive integer");
	else
		System.out.println(no+ "is negative integer");
	
}
}