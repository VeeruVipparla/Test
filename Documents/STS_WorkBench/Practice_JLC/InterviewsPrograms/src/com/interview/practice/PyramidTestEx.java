package com.interview.practice;

import java.util.Scanner;

public class PyramidTestEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("How Many rows you want in Pyramid");
		int noOfRows = sc.nextInt();
		int rowCount =1 ;
		System.out.println("Here is your Pyramid Pattern");
		// Implementing Logic

		for (int i = noOfRows; i > 0; i--) {
			for (int j = 1; j <= i*2; j++) {//*2
				System.out.print(" ");
			}
			for (int j = 1; j <= rowCount; j++) {
				System.out.print(j+" ");
			}			
			for (int j = rowCount-1; j >= 1; j--)
	            {               
	                System.out.print(j+" ");            
	            }           
			System.out.println();
			rowCount++;
		}
	}
}