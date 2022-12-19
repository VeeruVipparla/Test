package com.java8.learn;

import java.util.function.Function;

public class FunctionItrfc {

	public static void main(String[] args) {
		Function<Integer, Integer> a=b-> b*2;
		Function<Integer, Integer> c=b-> b*b/b+b;
		System.out.println(a.andThen(c).apply(4));//0
		System.out.println(a.compose(c).apply(2));//0
				

	}

}
