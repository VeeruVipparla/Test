package com.practiceprograms;

public class StringWordDuplicateEX {
public static void main(String args[]) {
	String str="java learning in Java Center center in";
	//int count;
	String [] s1=str.toLowerCase().split(" ");
	for (int i = 0; i < s1.length; i++) {
		int count=1;
		for (int j = i+1; j < s1.length; j++) {
			if(s1[i].equals(s1[j])) {
				//count++;
			//	s1[j]="0";
				System.out.println(s1[j]);	
			}
		}
		//if(count > 1 )//&& s1[i] !="0")
		//	System.out.println(s1[i]);
	}
}
}
