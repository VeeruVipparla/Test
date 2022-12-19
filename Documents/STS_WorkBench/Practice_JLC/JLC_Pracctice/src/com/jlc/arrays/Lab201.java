package com.jlc.arrays;

public class Lab201 {
public static void main (String []args) {
	//int arr[]=null;// "main" java.lang.NullPointerException
	//System.out.println(arr.length);
	
	final int arr1[]=new int [2];
	
	
	System.out.println(arr1.length);
	//System.out.println(arr[0]);//arr cannot be resolved to a variable
	arr1[0]=10;
	arr1[1]=20;
	System.out.println(arr1[0]);
	System.out.println(arr1[1]);
	int arr[]=new int [5];
	System.out.println(arr.length+"1");
	
	
}
}
