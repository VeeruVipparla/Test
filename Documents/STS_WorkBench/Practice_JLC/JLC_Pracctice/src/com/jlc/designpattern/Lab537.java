package com.jlc.designpattern;

public class Lab537 {

	public static void main(String[] args) {
		Hello h = Hello.getHello();
		System.out.println(h);
		System.out.println(Hello.getHello());
		System.out.println(Hello.getHello());

		Hello h2 = (Hello) h.clone();
		System.out.println(h2);

	}

}

class Hello {
	private static Hello hello = null;// new Hello();

	static {
		hello = new Hello();
	}

	private Hello() {
	}

	public static Hello getHello() {
		if (hello == null)
			hello = new Hello();
		return hello;

	}

	protected Object clone() {
		return this;
	} 
}