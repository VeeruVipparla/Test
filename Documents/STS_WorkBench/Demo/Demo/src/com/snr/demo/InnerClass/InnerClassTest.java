package com.snr.demo.InnerClass;


class A{
	int b=20;
	void disp() {
		System.out.println("Member inner  super A class b value "+b);
	}
	
}

class B extends A{
	int a=10;
	
	class CC{
		void disp() {
			System.out.println("Member inner sub B class a value "+a);
		}
	}
	
}

public class InnerClassTest {

	public static void main(String[] args) {
		
		B b=new B();
		b.disp();
		
		B.CC c=b.new CC();
		c.disp();

	}

}



