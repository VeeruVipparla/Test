package com.java8.learn;

@FunctionalInterface
public interface TestInterface {
	 int show(int x, int y);

	default int show1() {

		System.out.println("show1");
		return 1;
	}

	default void show2() {

		System.out.println("show2");
	}

	default void show3() {

		System.out.println("show3");
	}
	
	static void showStaticMethod() {

		System.out.println("show Static Method");
	}
	//java 1.9 Version introduced Private method in interface.
	/*private static void showj9() {
		System.out.println("show Static Method");
	}*/
	//predicate example
	// boolean predicateEx(int a);

}
