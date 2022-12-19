package com.interview.practice;

import java.util.Scanner;

public class PyramidTest {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Hou Many rows you want in Pyramid ");
	int noOfRows=sc.nextInt();
	int rowCount=1;
	System.out.println("Here id your Pyramid");
	//Implementing the Logic
	
	for (int i = noOfRows; i >0; i--) {
	// Printing i Spaces at the beginning of each rows
		for(int j=1; j<=i; j++) {
			System.out.print(" ");
		}
		//printing rowCount value rowcount times at the end of row
		for(int j=1; j<=rowCount; j++) {
		System.out.print(j+" ");//rowCount/j
		}
		 System.out.println();
		// Implementing the rowCount 
		rowCount++;
	}

	}

}
