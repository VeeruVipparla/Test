package com.snr.demo.test;

public class DemoEx {

	public static void main(String[] args) {
		
		try{
		      //int data=100/0;
				/*
				 * String s=null; System.out.println(s.length());//NullPointerException
				 */		  
			int a[]=new int[5];  
			a[10]=50; 
			
		}catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
		   System.out.println("rest of the code...");
		  }

	}


