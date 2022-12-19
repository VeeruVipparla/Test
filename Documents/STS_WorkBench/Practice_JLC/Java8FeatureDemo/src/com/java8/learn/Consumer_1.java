package com.java8.learn;

import java.util.function.Consumer;

public class Consumer_1 {

	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s);
		c.accept("Veeru");

		Consumer<String> str = (x) -> {
			System.out.println(x + "JAVA1.8");
		};

			Consumer<String> str1 = (y) -> {
				System.out.println(y + "OK|||");
			};	

			str.andThen(str1).accept("VEERUJAVA8");
	}
}
