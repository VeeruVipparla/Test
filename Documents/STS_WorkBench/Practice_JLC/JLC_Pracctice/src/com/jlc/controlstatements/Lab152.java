package com.jlc.controlstatements;

public class Lab152 {

	public static void main(String[] args) {
		char ch = 'A';
		if (ch >= 65 && ch < 90) {
			switch (ch) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Character is Vowel");
				break;
			default:
				System.out.println("Character id Constant");
			}
		} else {
			System.out.println("Invalid Alphabet");

		}
	}

}
