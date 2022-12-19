package com.jlc.scanner;

import java.util.Formatter;

public class Lab684 {

	public static void main(String[] args) {
	Formatter fmt=new Formatter();
	String name="Veeru";
	int age=116;
	Formatter  f=fmt.format("My name is %s and age is %d",name, age);
	System.out.println(f);
	Formatter fmt1=new Formatter();
	fmt1.format("%c-%f-%b %n%05d-%o-%x-%X",'C',99.99,true,3456,3456,3456,3456);
	System.out.println(fmt1);
	}

}
