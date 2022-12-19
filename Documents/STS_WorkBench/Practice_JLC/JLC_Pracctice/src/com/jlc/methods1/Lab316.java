package com.jlc.methods1;

public class Lab316 {

	public static void main(String[] args) {
		Hello5 h=new Hello5();
		h.show(10);
		h.show(10, 20);
		h.show(10, 20,30);
		h.m1();
		h.m2();
		
	}

}
class Hello5{
	void m1(int...a) {
		System.out.println("m1(int...)");
	}
	void m2(String...a) {
		System.out.println("m1(String...)");
	}
	void show(int a,int...arr) {
		
		System.out.println("\nshow(int,int...)"+a+arr);
	}
	
}