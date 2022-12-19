package com.jlc.controlstatements;

public class Lab183_Continue {

	public static void main(String[] args) {
	for (int i = 0; i <= 5; i++) {
		System.out.println("\n"+i);
		for( int j=1;j<=5;j++,System.out.println("j++")) {
			if (i==3)continue;
		}
		if (i==5)
			continue;
		System.out.println("**AFTER");
	}
	}

}
