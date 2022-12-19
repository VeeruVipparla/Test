package com.java8.learn;

import java.util.function.UnaryOperator;


/**
 * Represents an operation on a single operand that produces a result of the
 * same type as its operand.  This is a specialization of {@code Function} for
 * the case where the operand and result are of the same type.
 * 
 */
public class UnaryOperationEx {
	
	public int showInt(int i) {
		int b=i*i;
		System.out.println("core Java 7 :: "+b);
		return b;
	}

	public static void main(String[] args) {
		
		UnaryOperationEx uo=new UnaryOperationEx();
		uo.showInt(6);
		
		UnaryOperator<Integer> u= i -> i*i;
		
		System.out.println("Core java 8 :: "+u.apply(6));
	}

}


/*
 * UnaryOperations<Integer> f= (i)-> (i*i); Sop(f.applyInt(6));
 */
