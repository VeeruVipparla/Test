package com.practiceprograms;

abstract class Diagram {
	double d1;
	double d2;

	Diagram(double a, double b) {
		d1 = a;
		d2 = b;
	}

	// area is now abstract method
	abstract double area();
}

class Rectangle extends Diagram {

	Rectangle(double a, double b) {
		super(a, b);
	}

	@Override
	double area() {
		System.out.println("Inside Area for Rectangle.");
		return d1 * d2;
	}

}

class Triangle extends Diagram {

	Triangle(double a, double b) {
		super(a, b);

	}

	@Override
	double area() {
		System.out.println("Inside Area for Triangle.");
		return d1 * d2 / 2;
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// Diagram d = new Diagram(10, 10); // illegal now
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);

		Diagram diagRef; // This is OK, no object is created
		diagRef = r;
		System.out.println("Area of Rectangle is  " + diagRef.area());
		diagRef = t;
		System.out.println("Area of Triangle is  " + diagRef.area());
	}
}
