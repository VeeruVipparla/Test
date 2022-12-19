package com.jlc.wrapper;

public class Lab510_PtoW {

	public static void main(String[] args) {
		int a = 10;
		Integer i = new Integer(a);
		System.out.println(i);
		byte b = 123;
		Byte bref = new Byte(b);
		System.out.println(bref);
		char ch = 'A';
		char cref = new Character(ch);
		System.out.println(cref);

		Character ch1 = new Character('A');
		char c = ch1.charValue();
		System.out.println(c);
		Boolean b1 = new Boolean(false);
		boolean bol = b1.booleanValue();
		Float f1 = new Float(300.3434);
		byte by1 = f1.byteValue();
		int in = f1.intValue();
		float fl = f1.floatValue();
		short sh = f1.shortValue();
		long ln = f1.longValue();
		double d = f1.doubleValue();

	}

}
