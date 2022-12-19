package com.jlc.operators;

public class Lab84_StringConct {

	public static void main(String[] args) {
     int a=90;
     int b=9;
     int c=a+b;
     String str="Sum of"+a+"and"+b+"is"+c;
     String str1=""+a;//cannot convert from int to String
     String str2=a+"";
     System.out.println("result is "+a+b);
     System.out.println(a+b+"is result");
     System.out.println(a-b+"is result");
     System.out.println("Result is"+(a-b));//a-b The operator - is undefined for the argument type(s) String, int
     System.out.println("Result is "+a+-b);
     System.out.println("Result is "+a+(-b));
     System.out.println(str1);
     System.out.println(str2);
     System.out.println(str);
     System.out.printf("\n Sum of %d and %d is %d.\n",a,b,c);
     
     float f=10.00f;
     System.out.printf("\n Sum of %f.\n",f);
	}

}
