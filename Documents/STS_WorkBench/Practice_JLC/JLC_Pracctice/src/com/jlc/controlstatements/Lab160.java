package com.jlc.controlstatements;

public class Lab160 {

	public static void main(String[] args) {
		byte b=127;
		b++;
		System.out.println(b);
		for(byte by=10;by>0;by++) {
			System.out.println(by);
		}
		int val=2147483640;
		for(;val>200;val++) {
			System.out.println(val);
		}
		System.out.println("After loop"+val);
		
		System.out.println("==================");
		char ch='A';
		for(int rows=0;rows<5;rows++) {
			for(int cols=0; cols<=rows;cols++) {
				
				System.out.print(ch);
			}
			System.out.println();
		}
		/*
		 * final boolean b1=true; for(;b1;) //infinite values System.out.println("JLC");
		 * // System.out.println("AFTER");//Unreachable code
		 */
	
		}

	}


