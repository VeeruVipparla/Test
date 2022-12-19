package com.jlc.arrays;

public class Lab197 {
public static void main(String args[]) {
	byte b=5;
	int arr1[]=new int [b];
	short s=4;
	int arr2[]=new int [s];
	System.out.println(arr1.length);
	System.out.println(arr2.length);
	
	char ch='A';
	int arr3[]=new int [ch];
	int arr4[]=new int [5];
	int arr5[]=new int [10+20/5];
	double  d=12.345;
	int  arr6[]=new int  [(int) d];
	
	System.out.println(arr3.length);
	System.out.println(arr4.length);
	System.out.println(arr5.length);
	System.out.println(arr6.length);
	
	
	//int arr[]=new int [5L];
	//int arr7[]=new int [5.0f];
	int arr8[]=new int [214748364];
	System.out.println(arr8.length);
	
	int arr9[]=new int [-1];//Exception in thread "main" java.lang.NegativeArraySizeException: -1
	System.out.println(arr9.length);
	
	
}
}
