package com.jlc.scanner;

import java.util.Formatter;

public class Lab683_FormatterClass {

	public static void main(String[] args) {
		Formatter fmt=new Formatter();
		Formatter res=fmt.format("Multification of %d and %d is %d", 10,20,(10*20));
		System.out.println(res);
		fmt.close();
			
	}//format("Sum of %d and %d is %d", 10,20,(10+20)).toString();

}
