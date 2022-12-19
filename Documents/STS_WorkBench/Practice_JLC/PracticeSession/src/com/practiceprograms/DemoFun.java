package com.practiceprograms;

@FunctionalInterface
public interface DemoFun {
	public void disp(int a, int b);
	
	  default void m1(int a, int b) {
		System.out.println("This method is default method in interface  "+(a*b));
	}

}
