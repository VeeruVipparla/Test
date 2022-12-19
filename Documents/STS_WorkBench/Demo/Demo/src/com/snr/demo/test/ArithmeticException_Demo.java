package com.snr.demo.test;

//public class ArithmeticException_Demo {

	/*
	 * public static void main(String[] args) {
	 * 
	 * { try { int a = 30, b = 0; int c = a/a; System.out.println("Result" +c); }
	 * catch (ArithmeticException e) { System.out.println(); }
	 * 
	 * }
	 * 
	 * } }
	 */
	public class ArithmeticException_Demo {
	      
	    public static void main(String args[]) {
	        try 
	        {
	            Class.forName("GeeksForGeeks");
	        }
	        catch (ClassNotFoundException ex)
	        {
	            ex.printStackTrace();
	        }
	    }
	}
	
	/*
	 * // Java program to illustrate // NoClassDefFoundError 
	 * class GeeksForGeeks {
	 * void greeting() {
	 *  System.out.println("hello!"); 
	 *  }
	 *   }
	 * 
	 * class G4G { 
	 * public static void main(String args[]) {
	 *  GeeksForGeeks geeks = new geeksForGeeks();
	 *  
	 * geeks.greeting();
	 *  }
	 *  }
	 */