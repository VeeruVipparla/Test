package com.practiceprograms;

import java.util.Arrays;

public class ArrayMissedNumberEx {
	
	public static void main(String args[]) {
		int a[]= {5,3,4,6,1};
		Arrays.sort(a);
		int missed=0;
		for(int i=0; i<a.length;i++) {
			int index=i+1;
			if(a[i]!=index) {
				missed = index;
				break;
			}
		}
		System.out.println(missed);
	}
}
