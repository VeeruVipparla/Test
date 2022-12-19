package com.jlc.controlstatements;

public class ArrayForLoopReverse {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50 };
		
		//String str="JAVAJ2EE";// EE2AVAJ

		// new int[5];
		/*
		 * a[1]=10; a[2]=20; a[3]=30; a[4]=40; a[5]=50;//a[6]=60;
		 */

		System.out.println("hello "+a.length);
		
		
			String str1 = "JAVAJ2EE";
			 
			char[] charArray = str1.toCharArray();
			
			  for (int i = charArray.length - 1; i >= 0; i--) {
			  System.out.print(charArray[i]); //Output : avaJyM }
			  }
		
		System.out.println(" \t"+recursiveMethod("My Java"));
			  
	}
	
	 static String recursiveMethod(String str)
	    {
	         if ((null == str) || (str.length() <= 1))
	         {
	                return str;
	         }
	 
	         return recursiveMethod(str.substring(1)) + str.charAt(0);
	    }

}
