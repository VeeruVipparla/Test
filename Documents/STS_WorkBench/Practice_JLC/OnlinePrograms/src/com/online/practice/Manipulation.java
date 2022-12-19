package com.online.practice;

public class Manipulation { // Super class
	public void add(String name) { // String parameter

	}
}
class Addition extends Manipulation{
	private void add() {
		System.out.println("Show");
	}

	public void add(int a) { // integer parameter
	}
	public static void main(String args[]) {
		Addition addition = new Addition();
		addition.add();
	}
	}
