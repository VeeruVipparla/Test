package com.online.practice;

import java.util.Scanner;

public class PasswordVerify {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Password");
		String password = sc.next();

		if (password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*")
				&& password.matches(".*[0-9].*") && password.matches(".*[~,!,@,#,$,%,^,&,*,>,(,)].*")) {

			System.out.println("your Password is valid");

		} else {
			System.out.println("your password is not Valid");
		}
	}

}
