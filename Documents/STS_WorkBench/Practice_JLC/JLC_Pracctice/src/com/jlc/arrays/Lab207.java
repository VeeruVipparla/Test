package com.jlc.arrays;

// Array Declaration <modifier> <dataType> <refName>[];
// Array initialization int arr[]; , arr =new int [];
// Array Declaration and Construction <dataType> <refName>[]=new <dataType> <Size[]>
// Array Declaration,Construction,initialization
//  <dataType> <refName>[]={val1,val2,val3,.....};
public class Lab207 {
	public static void main(String[] args) {

		int arr[] = { 10, 20, 30 };
		System.out.println("Len::"+arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			String names[]= {"Sri","Veeru","Raju"};
			System.out.println(names.length);
			for (int j = 0; j < names.length; j++) {
				System.out.println(names[j]);
			}
		}
		int arr1[]= {};
		System.out.println("Len :"+arr1.length);
		for (int k = 0; k < arr1.length; k++) {
			System.out.println(arr1[k]);
			
		}
		
		

	}
}