package com.online.practice;

public class ModelString {

	static String name = "Veeru@123";
	static String number = "Qa1234567890AbC";

	public static boolean verifiedName() {
		if (name.matches("[a-zA-Z1-9@#$%^&]+")) {
			return true;
		} else {
			return false;

		}
	}
	private static boolean verifiedNumber() {
		if(number.matches("[0-9A-Za-z]+")) {
			return true;
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		System.out.println(verifiedName());
		System.out.println(verifiedNumber());

	}
	
	

}
