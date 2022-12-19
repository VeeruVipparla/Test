package com.java.pract_progrms;

public class PyramidClass {

	public static void main(String[] args) {
		char ch='5';
		int rows=0;
		while(rows<5)
		{
			int cols=0;
			while(cols<=rows) {
			//	System.out.print(" ");
				System.out.print(ch+"");
				cols++;
			}
			System.out.println();
			rows++;
		}

	}

}
