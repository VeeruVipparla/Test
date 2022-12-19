package com.java8.learn;

public class TestInterfaceImpl implements TestInterface {

	@Override
	public int show(int x, int y) {
		System.out.println("================="+(x*y));
		return (x*y);
	}

}
