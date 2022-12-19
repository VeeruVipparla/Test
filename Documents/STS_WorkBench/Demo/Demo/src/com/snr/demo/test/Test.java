package com.snr.demo.test;

abstract class AbstractDemo {

	public abstract void display1(int a);

}

class subA extends AbstractDemo {

	// @Override
	public void display1(int a) {
		// TODO Auto-generated method stub

		System.out.println(" welcome Veeru,SN abtract example " + (a * a + ++a));

	}

}

class Test {
	public static void main(String[] args) {
		subA s = new subA();
		s.display1(10);

	}
}
