package com.jlc.controlstatements;

public class Lab171 {

	public static void main(String[] args) {
	char ch='1';
	int ch1=2;
	int ch2=3;
	int rows=0;
	while (rows<5) {
		int clms=0;
		
		while (clms<=rows) {
			System.out.print(ch);
			//System.out.print(ch1);
			//System.out.print(ch2);
			clms++;
		}
		System.out.println();
	rows++;
	}
	}
}