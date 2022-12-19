package com.jlc.date;

import java.util.Calendar;

public class Lab675 {

	public static void main(String[] args) {
		Calendar today=Calendar.getInstance();
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.DATE, 20);
		cal.set(Calendar.MONTH, 10);
		cal.set(Calendar.YEAR, 2021);
		System.out.println("After Today ::"+today.after(cal));
		System.out.println("Before Today::"+today.before(cal));
		System.out.println("compareTo::"+today.compareTo(cal));
		
		
		

	}

}
