package com.jlc.arrays;

public class Lab193 {

	public static void main(String[] args) {
		int arr[];
		arr = new int[3];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		String arr1[];
		arr1 = new String[3];

		/*for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);*/
		
			System.out.println("----------");
			arr1[0]="JAVA";
			arr1[1]="JAVA1";
			arr1[2]="JAVA2";
			
			for (int i1 = 0; i1 < arr1.length; i1++) {
				System.out.println(arr1[i1]);
				
			}
			

		}

	}

