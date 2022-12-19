package com.snr.miscellaneous;

import java.util.Arrays;

public class ArrayMissedNumber {

	public static void main(String[] args) {
		int a[] = {1,8,7,6,5,4,2};

		Arrays.sort(a);

		/*
		 * for(int i:a) { System.out.println("value :: :: "+i); }
		 */
		int missed = 0;
		
		for (int i = 0; i < a.length; i++) {
			int index = i + 1;
			if (a[i] != index) {
				missed=index;//a[i+1];
				break;

			}

		}
		System.out.println("missed Number is "+missed);

		int a1[]= {1,2,3,5,6,7,8};	

		/*
		 * for(int i:a1) { System.out.println("value :: :: "+i); }
		 */
		int missed1=0;

		for (int i = 0; i < a1.length; i++) {
			int index = i + 1;
			if (a1[i] != index) {
				missed1=index;//a[i+1];
				break;

			}

		}
		System.out.println("missed Number is "+missed1);

	}

}
