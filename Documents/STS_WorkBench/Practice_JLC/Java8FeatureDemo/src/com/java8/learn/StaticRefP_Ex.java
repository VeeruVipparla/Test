package com.java8.learn;

interface StaticReference1 {
	void hello();

}

public class StaticRefP_Ex {
	
	

	public static void showStaticreference() {
		System.out.println("======StaticRefferenceSuccessfully======");
	}

	public static void main(String[] args) {
		StaticReference1 sr1 = StaticRefP_Ex::showStaticreference;
		sr1.hello();

	}

}
