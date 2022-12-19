package com.practiceprograms;


 class Test {
	/*
	 * Test() { super(); //this(); super(); System.out.println("Constructor"); //
	 * super(); }
	 */
	
	public static void main(String[] args) {
		
		DemoFun df=(a, b) -> System.out.println(a+b);
		df.disp(2, 4);
		df.m1(20,10);
	}
}
