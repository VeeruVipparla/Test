package com.snr.demo.test;

class Mydad {
	int mydadAge;

	public Mydad(int mydadAge) {
		this.mydadAge = mydadAge;
	}

	void show() {
		System.out.println("My dad age is ::" + mydadAge);
	}

}

class Son extends Mydad {
	 int sonAge;

	public Son(int mydadAge, int sonAge) {
		super(mydadAge + sonAge + 1);
		this.sonAge = sonAge;
	}

	void show() {
		super.show();
		System.out.println("My son age is ::" + sonAge);
	}

}

public class InhirentaceDemo {
	public static void main(String[] args) {

		Son son = new Son(24, 24);
		son.show();

	}
}