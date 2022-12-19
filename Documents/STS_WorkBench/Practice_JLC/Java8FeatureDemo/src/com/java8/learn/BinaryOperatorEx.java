package com.java8.learn;

import java.util.function.BinaryOperator;

public class BinaryOperatorEx {

	public static void main(String[] args) {
		
		BinaryOperator<String> bo=(s1,s2) -> s1.trim().toLowerCase().concat(s2.trim().toLowerCase());
		//trim() --white space removed from string object.
		String str=bo.apply(" VEERU ", " SNRAJU ");
		System.out.println("output ::"+str);
		
		BinaryOperator<Integer> bo1=(a,b) -> a*b*a;
		Integer in=bo1.apply(3, 4);
		System.out.println("BinaryOperator Integer value :: "+in);
		

	}

}
