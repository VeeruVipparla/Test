package com.interview.practice;

import java.util.Arrays;

public class ArraysMissNumber {

	public static void main(String[] args) {
		int a[] = { 1,4,2,6,5,3,9,13,11,10,8,12};
	//	Arrays.sort(a);
		int missed = 0;
		for (int i = 0; i < a.length; i++) {
			int index = i + 1;
			if (a[i] != index) {
				missed = index;
				break;
			}//[1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13]
		}
		System.out.println("Missed value is::-" + missed);
	}
}
	
/*	int [] number= {21,23,24,25};
	System.out.println("The Missing Number is::-"+getMissedNum(number));
	
	}
	static int getMissedNum(int arr[]) {
		int b,total;
		int n=arr.length;
		total=(n+1)*(n+2)/2;
		for (int i = 0; i < n; i++) {
			total -=arr[i];
			
		}
		return total;
		
		
	}
	}*/


