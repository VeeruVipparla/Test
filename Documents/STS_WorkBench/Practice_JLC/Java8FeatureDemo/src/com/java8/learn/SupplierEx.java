package com.java8.learn;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierEx {
	
	public Date ShowDate() {
		return new Date();
	}

	public static void main(String[] args) {
		SupplierEx se=new SupplierEx();
		System.out.println("Date is  java7:: "+se.ShowDate());
		
		Supplier<Date> s=() -> {
			 return new Date();
		};
		System.out.println("Date is  java8 s :: "+s.get());
		
		Supplier<Date> s1= ()-> new Date();
		
		System.out.println("Date is  java8  s1 :: "+s1.get());
		

	}

}
