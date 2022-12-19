package com.jlc.operators;

public class Lab93_Typecasting {

	public static void main(String[] args) {
	byte b=10;
	short s=b;
	int a=65;
	long x=a;
	float f=x;
	double d=f;
	System.out.println(b);
	System.out.println(s);
	System.out.println(a);
	System.out.println(x);
	System.out.println(f);
	System.out.println(d);
	System.out.println("=================");
	int a1=10;
	byte b2=(byte) a1;
	char ch=(char) a;
	byte b1=(byte) ch;
	System.out.println(a1);
	System.out.println(ch);
	System.out.println(b1);
	System.out.println(b2);
	float f1=1234.456F;
	int c=(int) f1;
	System.out.println(f1);
	System.out.println(c);
	System.out.println("===================");
//	boolean b3=1;//cannot convert from int to boolean
//	int i="jlc";//cannot convert from String to int
//	boolean b=(boolean)1;//Cannot cast from int to String
//	String str3=(String)99;//Cannot cast from int to String
	byte b4=12;
	byte b5=23;
	byte b6=(byte) (b4+b5);
//	byte b7=(byte)b1+(byte)b2;
	System.out.println(b6);
	
	
	

	}

}
