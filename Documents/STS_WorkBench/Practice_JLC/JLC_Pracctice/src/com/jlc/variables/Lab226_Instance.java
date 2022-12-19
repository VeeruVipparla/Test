package com.jlc.variables;

public class Lab226_Instance {

	public static void main(String[] args) {
		int a5;//The local variable a5 may not have been initialized
		System.out.println(a5);
		
		Hello h=new Hello();
		Hello h1=new Hello();
		new Hello().a2=99;
		System.out.println(new Hello().a2);
		System.out.println(h.a+"\t"+h1.a1);
		h.a="veeru";
		h1.a1=99;
		System.out.println(h.a+"\t"+h1.a1);
		Hello h2=null;
		System.out.println(h.a3);
		System.out.println(Hello.a4);//Cannot make a static reference to the non-static field Hello.a4
		
	}

}
class Hello{
	String a;
	int a1;
	int a2;
	int a3;
	int a4;
}

