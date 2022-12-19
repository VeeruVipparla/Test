package com.snr.miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissedNumber {

	public static void main(String[] args) {
		int a[] = {5, 10, 15, 20, 30 };
		
		List<Integer> list=Arrays.asList(5, 15, 20, 30 );
		
		Collections.sort(list);
		
		List<Integer> list2=new ArrayList<>();
		int missed=0;
		int nextValue=0;
		
		for(Integer value:list) {
			//for(int i=0; i<list.size(); i++) {
			value+=5;
			 
			
			if(!list.contains(nextValue)) {
				missed=nextValue;
			}
			
		}
			
			
		
		
		System.out.println("miseed no :: "+missed);
		

		/*for (int i : a) {
			System.out.println("value of ==" + i);
		}

		//int missed = 0;
		for (int i = 0; i < a.length; i++) {
		int index = i+1;
			
			if (a[i] != index) {
				missed = index;
				break;
			}

		}

		System.out.println("Missing Number in Array" + missed);*/
	}

}
	
