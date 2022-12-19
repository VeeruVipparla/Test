package com.jlc.exception;



public class Unchecked {

	public static void main(String[] args) {
		
		Exception e=new NegativeArraySizeException();
		Exception e1=new NullPointerException();
		Exception e2=new ClassCastException();
		Exception e3=new ClassNotFoundException();
		System.out.println(e instanceof RuntimeException);
		System.out.println(e1 instanceof RuntimeException);
		System.out.println(e2 instanceof RuntimeException);
		System.out.println(e3 instanceof RuntimeException);
		
	}

}
