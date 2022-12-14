package com.jlc.date;

import java.util.Calendar;
import java.util.Date;

public class Lab674_Calendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		System.out.println(cal);
		Date dt = cal.getTime();
		System.out.println(dt);
		System.out.println("DAY::" + cal.get(Calendar.DATE));
		System.out.println("DAY::" + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("MON::" + cal.get(Calendar.MONTH));
		System.out.println("YEAR::" + cal.get(Calendar.YEAR));
		System.out.println("HOUR::" + cal.get(Calendar.HOUR));
		System.out.println("Hour Of The Day::" + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("MIN::" + cal.get(Calendar.MINUTE));
		System.out.println("SEC::" + cal.get(Calendar.SECOND));
		System.out.println("AM_PM::" + cal.get(Calendar.AM_PM));
		System.out.println("\n ADDIND 7 DAYS::");
		cal.add(Calendar.DATE, 7);
		System.out.println(cal.getTime());
		System.out.println("\n set MONTH as NOVEMBER");
		cal.set(Calendar.MONTH, Calendar.NOVEMBER);
		System.out.println(cal.getTime());

	}

}
