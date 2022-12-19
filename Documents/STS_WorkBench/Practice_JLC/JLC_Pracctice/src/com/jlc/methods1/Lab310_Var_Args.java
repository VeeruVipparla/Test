package com.jlc.methods1;

public class Lab310_Var_Args {

	public static void main(String[] args) {
	Hello3 h=new Hello3();
	h.sum(12, 23);
	h.sum(11, 11, 11);
	}

}
class Hello3{
	void sum(int a,int b) {
		System.out.println("--sum(int,int)");
		System.out.println(a+b);
	}
	void sum(int a,int b,int c) {
		System.out.println("Multification if 3 numbers::- "+a*b*c);
	}
	
}