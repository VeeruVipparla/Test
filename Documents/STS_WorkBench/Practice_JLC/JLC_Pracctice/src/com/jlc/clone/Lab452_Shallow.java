package com.jlc.clone;

class Hai {
	int x;

	Hai(int x) {
		this.x = x;
	}
}

class Hello implements Cloneable {
	int y;
	Hai hai;

	Hello(int y, Hai hai) {
		this.y = y;
		this.hai = hai;
	}

	void show() {
		System.out.println("Hello-> :" + y);
		System.out.println("Hai-> :" + hai.x);
	}

	public Object clone() throws CloneNotSupportedException {

		return super.clone();

	}
}

public class Lab452_Shallow {

	public static void main(String[] args) throws CloneNotSupportedException {
		Hai hai = new Hai(10);
		Hello h1 = new Hello(20, hai);
		Hello h2 = (Hello) h1.clone();
		h1.show();
		h2.show();
		System.out.println(h1 == h2);
		System.out.println(h1.hai == h2.hai);
		h2.y = 30;
		h1.show();
		h2.show();
		h2.hai.x = 111;
		h1.show();
		h2.show();

	}

}
