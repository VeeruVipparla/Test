package com.practiceprograms;

import java.util.Optional;

public class OptionalEX {

	public static void main(String[] args) {
		String[] s1 = new String[10];
		s1[5] = "My name is Veeru";
		Optional<String> o1 = Optional.ofNullable(null);
		if (o1.isPresent()) {
			String L1 = s1[5].toLowerCase();
			System.out.println(L1);
		} else if (o1==null) {
			System.out.println("veeru");
		}

		else
			System.out.println("String is not Present");
	}
}
