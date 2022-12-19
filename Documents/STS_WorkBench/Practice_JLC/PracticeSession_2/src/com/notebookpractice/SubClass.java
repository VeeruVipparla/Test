package com.notebookpractice;

import java.io.IOException;

class SuperClass {

	// SuperClass doesn't declare any exception
	void method() {
		System.out.println("SuperClass");
	}
}

// SuperClass inherited by the SubClass
class SubClass extends SuperClass {

	// method() declaring Unchecked Exception ArithmeticException
	//IOException---ArithmeticException
	void method() throws ArithmeticException {

		// ArithmeticException is of type Unchecked Exception
		// so the compiler won't give any error

		System.out.println("SubClass");
	}

	// Driver code
	public static void main(String args[]) {
		SuperClass s = new SubClass();
		s.method();
	}
}
