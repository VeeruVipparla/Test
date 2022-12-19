package com.jlc.methods;

public class Lab280_Static {

	public static void main(String[] args) {
	Operation.showRemainder(12, 4);	
	Operation.showRemainder(10, 2);
	}

}
class Operation{
	static void showRemainder(int a , int b) {
		if(b==0)
			return;
	System.out.println(a/b);
	}
	
} 