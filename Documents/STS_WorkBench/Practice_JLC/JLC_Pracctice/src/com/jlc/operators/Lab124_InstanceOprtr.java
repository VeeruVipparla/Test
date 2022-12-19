package com.jlc.operators;

//Instance operator is given object belongs to specified class or not
//return type is boolean value
class Hello1{}
public class Lab124_InstanceOprtr {

	public static void main(String[] args) {
		Hello1 h1=new Hello1();
		Object obj=new Hello1();
		System.out.println(h1 instanceof Hello1);
		System.out.println(h1 instanceof Object);
//		System.out.println(h1 instanceof String);//Incompatible conditional operand types Hello1 and String
        
	}

}
