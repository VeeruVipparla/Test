package com.jlc.methods;

public class Lab298 {
public static void main(String[] args) {
	Hello4 h=new Hello4();
	String s=h.add("Veeru", 10);
	int i=h.add(11, 22);
	System.out.println(s);//Veeru10
	System.out.println(i);//33
	System.out.println(Hello4.add(11,11));
	System.out.println(Hello4.add("veeru",11));
}
}
class Hello4{
	static String add(String x,int y) {
		//System.out.println("add(String,int)");
		return x+y;
		
	}
	static int add(int a,int b) {
		//System.out.println("add(int,int)");
		return a+b;
	}
}