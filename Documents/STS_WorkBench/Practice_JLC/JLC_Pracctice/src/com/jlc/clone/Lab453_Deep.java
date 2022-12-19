package com.jlc.clone;

public class Lab453_Deep {

	public static void main(String[] args) throws CloneNotSupportedException {
		Hi hi = new Hi(10);
		Helo h1 = new Helo(20, hi);
		Helo h2 = (Helo) h1.clone();
		System.out.println(h1 == h2);
		System.out.println(h1.hi == h2.hi);
		h1.show();
		h2.show();
		h2.y = 11;
		h2.hi.x = 22;
		h1.show();
		h2.show();

	}

}

class Hi {
	int x;

	Hi(int x) {
		this.x = x;
	}
}

class Helo implements Cloneable {
	int y;
	Hi hi;

	Helo(int y, Hi hi) {
		this.y = y;
		this.hi = hi;
	}

	void show() {
		System.out.println("Helo-> :" + y);
		System.out.println("Hi-> :" + hi.x);

	}

	public Object clone() throws CloneNotSupportedException {
		if (this instanceof Cloneable) {
			Hi hi = new Hi(this.hi.x);
			Helo h = new Helo(this.y, hi);
			return h;
		} else
			throw new CloneNotSupportedException(getClass().getName());

	}
}
