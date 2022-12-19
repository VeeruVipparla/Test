package com.jlc.operators;

public class Lab128_ConditionalOprtr {

	public static void main(String[] args) {
		int a=true?10:20;
		int b=false?10:20;
		System.out.println(a);
		System.out.println(b);
		System.out.println();
//		int c=20>10?10:20.0; cannot convert from double to int
		double d=20>10?10:20.0;
//		int x=10>20?10:"TWENTY";//cannot convert from String to int
//		String str=10>20?10:"TWENTY";
		Object obj=10>20?10:"TWENTY";
		System.out.println(obj);
		System.out.println();
		
		int c=10;
		int e=20;
		int f=30;
		int max =c>e?c:e;
		System.out.println(max);
		int min = c<e?c:e;
		System.out.println(min);
		int max1=(c>e)?((c>f)?c:f):((e>f)?e:f);
		System.out.println(max1);

}
}