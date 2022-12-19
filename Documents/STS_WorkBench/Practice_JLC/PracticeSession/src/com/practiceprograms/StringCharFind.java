package com.practiceprograms;

public class StringCharFind {
public static void main(String args[]) {
	String str="javaj2ee";
	char [] s1=str.toCharArray();
	for (int i = 0; i < s1.length; i++) {
		int count=1;
		for (int j = i+1; j < s1.length; j++) {
			if(s1[i]==s1[j]) {
				count++;
			}
		}
		if(count >1)
			System.out.println(s1[i]);
	}
}
}
