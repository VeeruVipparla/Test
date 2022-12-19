package com.jlc.methods;

public class Lab283 {

	public static void main(String[] args) {
		Hello h=new Hello();
		double a=h.show(10);
		System.out.println(h+"\n"+a);
	//	System.out.println(a);
		System.out.println("Hello Guys");
		char a1= h.show('B');
		System.out.println(a1);
	}

}
class Hello{
	double show(double x) {
		return x+3;
		
	}
	char show(char y) {
		return (char) (y+'A');
	}
}