package com.jlc.controlstatements;

public class Lab180 {

	public static void main(String[] args) {
		JLC:
	/*	for (int i = 0; i <= 5; i++) {
			System.out.println("\n" + i);
			for (int j = 1; j <= 5; j++, System.out.println("j++")) {
				if (i == 3)
					break;
				System.out.print("JLC" + j);
			}

		}*/
		
		for (int i = 1; i <=5; i++) {
			for (int j = 0; j <=3; j++) {
				if(i==3)
					break JLC;
				System.out.println(i+"\t"+j);
			}
		}
		
		
	}

}
