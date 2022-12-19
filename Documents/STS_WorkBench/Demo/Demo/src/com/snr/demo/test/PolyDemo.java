package com.snr.demo.test;

class A{
	int a;
	
	public A(int a) {
		this.a=a;
		
	}
	void disp() {
		System.out.println("A addition"+a+a);//5
	}
}

class B extends A{
	int b;
	
	public B(int b) {
		super(b+1);
		this.b=b;
	}
	
	void disp() {
		super.disp();
		System.out.println("A addition"+b*b);//16
	}
	
}


class C extends A{
	int c;
	
	public C(int c) {
		super(c+3);
		this.c=c;
	}
	
	void disp() {
		super.disp();
		System.out.println("C addition"+c/c);
	}
	
}

public class PolyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a;
		 a=new B(4);
		 a.disp();
		 a= new C(8); //polymorphism
		 a.disp();
		 
		

	}

}
