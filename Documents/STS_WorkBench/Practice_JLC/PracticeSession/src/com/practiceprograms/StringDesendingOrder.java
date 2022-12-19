package com.practiceprograms;

import java.util.Arrays;

public class StringDesendingOrder {

	public static void main(String[] args) {
		//int [] s= {1, 2, 3};
		String[] s= {"Veeru","Lasya","Raju"};
	//	int size=s.length;
		for(int i=0; i<s.length; i++) {
			for(int j=i+1;j<s.length;j++) {
/*				
			if(s[j]>s[i])	{
				int temp=s[i];
				s[i]=s[j];
				s[j]=temp;
*/
				if(s[i].compareTo(s[j])>0) {
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
			}
			}
		}
		System.out.println(Arrays.toString(s));
	
	}

}
