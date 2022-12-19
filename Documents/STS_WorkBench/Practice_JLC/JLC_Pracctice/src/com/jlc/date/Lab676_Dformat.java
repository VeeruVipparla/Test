package com.jlc.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lab676_Dformat {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String res = sdf.format(new Date());
		System.out.println(res);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String res1 =sdf1.format(new Date());
		System.out.println(res1);
		Date dt=sdf.parse("2021-10-20");
		System.out.println(dt);
		
	}

}
