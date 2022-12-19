package com.veeru.Stringclass;
// Copying a String into an array
public class Strcpy {

	public static void main(String[] args) {
	String str= "Hello, this is a book on java";
	char arr[] = new char[30];
	//copying from str into arr starting from 7th character to 20th character
    str.getChars(7, 21,arr, 0);
	System.out.println(arr); 

	}

}
