package com.jlc.date;

import java.util.Date;

public class Lab673 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println("Date ::" + date.getDate());
		System.out.println("Month+1::" + date.getMonth() +1);
		System.out.println("Year::" + date.getYear());
		System.out.println("Year+1900:" + date.getYear() + 1900);
		System.out.println("Hours::" + date.getHours());
		System.out.println("Minitues::" + date.getMinutes());
		System.out.println("Seconds::" + date.getSeconds());

		System.out.println("\n Sorting date");
		date.setDate(20);
		date.setMonth(9);
		date.setYear(2021);
		System.out.println(date);

	}

}
