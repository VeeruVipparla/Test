package com.jlc.variables;

public class Lab254 {

	public static void main(String[] args) {
		Hello6 h=new Hello6();
		System.out.println("Main::"+ h);

	}

}
class Hello6{
	
	{
		int a=10;
		System.out.println("! Block 1::"+a);
	}
	static{
		String a="JlC";
		System.out.println("| Block 2::"+a);
	}
		
}