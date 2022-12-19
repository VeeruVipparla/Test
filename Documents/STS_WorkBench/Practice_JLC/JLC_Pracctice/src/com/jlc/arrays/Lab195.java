package com.jlc.arrays;

public class Lab195 {

	public static void main(String[] args) {
		//datatype arr[]=new datatype [size of array];
		//datatype[] arr=new datatype [size of array];
		int arr[]=new int[3];
		System.out.println("Len:"+arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			System.out.println("----------");
			arr[0]=10;
			arr[1]=20;
			arr[2]=30;
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[j]);
				
			}
			
			
		}
		System.out.println("====================");
		String arr1[]=new String [3];
		System.out.println("Array length::"+arr.length);
		for (int i = 0; i < arr1.length; i++) {
		System.out.println(arr1[i]);
		
		
		arr1[0]="10";
		arr1[1]="VEERU";
		arr1[2]="789";
		
		for (int j = 0; j < arr1.length; j++) {
			System.out.println(arr1[j]);
			//System.out.println("-----");
		}
		}
		

	}

}
