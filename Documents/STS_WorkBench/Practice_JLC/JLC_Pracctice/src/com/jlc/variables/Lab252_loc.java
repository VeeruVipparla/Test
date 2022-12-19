package com.jlc.variables;

interface Hai{
	 int a=10;
	void hello();
}
public class Lab252_loc {
	static {
		System.out.println("this is veeru");
	}

	public static void main(String[] args) {
		Hai h=Hello4::new;
		h.hello();
		System.out.println("Main::"+h.a);
		Hello4 h1=new Hello4();
		System.out.println(h1.a);
		
	}
	static {
		System.out.println("Not veeru");
	}

}
class Hello4{
	 int a=22;
	static {
	int b=1;
	char c='A';
	System.out.println(c);
	System.out.println(b);
	
}
}