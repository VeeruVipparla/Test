package com.java8.learn;
interface Constrmessage{
	ConstructorRefEx show(String str);

}

public class ConstructorRefEx {
	String str;

	public ConstructorRefEx(String str) {
		
		this.str = str;
		System.out.println("======ConstructorRefferenceSuccessfully======" + str);

	}

	public static void main(String[] args) {
		Constrmessage cm = ConstructorRefEx::new;
		cm.show("veeru");

	}

}
