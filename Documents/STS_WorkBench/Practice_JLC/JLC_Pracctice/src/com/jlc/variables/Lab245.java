package com.jlc.variables;

public class Lab245 {
	/*static int a = 10;
	{
		System.out.println("Instance Block");

	}
	static {
		System.out.println("Static Block");
	}*/
	public static void main(String[] args) {
		Hello2 h = null;
		h=new Hello2();
//		Hello2 h = new Hello2();
		System.out.println("Ref Created" );

	}

}

class Hello2 {
	static int a = 10;
	{
		System.out.println("Instance Block");

	}
	static {
		System.out.println("Static Block");
	}
}
