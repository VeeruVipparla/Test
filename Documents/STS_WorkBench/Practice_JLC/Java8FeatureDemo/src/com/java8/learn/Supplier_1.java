package com.java8.learn;

import java.util.Date;
import java.util.function.Supplier;

public class Supplier_1 {

	public static void main(String[] args) {
		
		Supplier<Date> s=()->  {return new Date();};
		System.out.println("Date is  java8  s :: "+s.get());
		
		
		
		Supplier<Date> s1=() -> {
			 return new Date();
		};
		System.out.println("Date is  java8 s :: "+s1.get());
		
		


}
}