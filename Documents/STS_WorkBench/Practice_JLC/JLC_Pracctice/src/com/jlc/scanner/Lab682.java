package com.jlc.scanner;

import java.util.Scanner;

public class Lab682 {

	public static void main(String[] args) {
		String str = "Hi this is veeru";
		Scanner sc = new Scanner(str);
		while (sc.hasNext()) {
			String st = sc.next();
			System.out.println(st);
		}
		sc.close();
		System.out.println("***********");
		String str2 = "Hi this is veeru java Trianing Center,and this is No1 Center in this city";
		Scanner sc1 = new Scanner(str2);
		sc1.useDelimiter("\\,");
		while (sc1.hasNext()) {
			String st = sc1.next();
			System.out.println(st);
		}
		sc1.close();
	}

}
