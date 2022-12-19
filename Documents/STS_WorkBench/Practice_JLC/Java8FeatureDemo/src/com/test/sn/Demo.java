package com.test.sn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//pwd verification
//1. minimum 8 characters It's shd be no,. 
//2.Upper case and lower case and  special chr's
//password valid or invalid

public class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your pasword");
		String name = sc.next();
		/*
		 * name.matches(".*[A-Z].*"); // {[0-9][A-Z][a-z]}
		 * 
		 * String[] str=name.split("");
		 * 
		 * //A-Z 65-95
		 * 
		 * List<String[]> list=new ArrayList<>();
		 * 
		 * if(list.contains(str))
		 * 
		 * 
		 * if(str.equals(name.toUpperCase())) {SNR
		 * 
		 * }
		 */

		if (name.length() > 8 && name.matches(".*[A-Z].*") && name.matches(".*[a-z].*")

				&& name.matches(".*[!,@,#,$,%,^,&,*,(,)].*")) {

			System.out.println("It's valid ");

		} else {

			System.out.println("It's not valid ");
		}

	}

}
