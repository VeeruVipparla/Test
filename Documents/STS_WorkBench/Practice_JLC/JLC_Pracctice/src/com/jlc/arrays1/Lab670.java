package com.jlc.arrays1;

import java.util.Arrays;
import java.util.List;

public class Lab670 {

	public static void main(String[] args) {
		int arr[]=new int [] {10,43,};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+"\t"+arr[i]);
			System.out.println("\n fill int[],101");
			Arrays.fill(arr, 101);
			for (int j = 0; j < arr.length; j++) {
				System.out.println(j+"\t"+arr[i]);
				Object values[]=new Object[5];
				values[0]="Veeru";
				values[1]=new Integer(123);
				values[2]=new Boolean(true);
				values[4]=new Double(12.67);
				List list=Arrays.asList(values);
				System.out.println(list);
				
			}
		}

	}

}
