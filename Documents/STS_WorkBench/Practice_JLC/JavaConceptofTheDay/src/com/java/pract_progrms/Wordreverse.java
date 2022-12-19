package com.java.pract_progrms;

public class Wordreverse {

	public static void main(String[] args) {
		String str="India Is My Country";
		String[]  reverse=str.split(" ");
	
		System.out.print(str+"\n");
		
		for (int i = reverse.length-1; i>=0; i--) {
			
			System.out.print(reverse[i]+" ");
		}

	}

}
