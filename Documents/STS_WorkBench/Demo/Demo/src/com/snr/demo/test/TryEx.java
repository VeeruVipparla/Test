package com.snr.demo.test;

import com.sun.org.apache.bcel.internal.classfile.ClassFormatException;

public class TryEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			/*
			 * int res=10/0;
			 * 
			 * System.out.println(res);
			 */
			int res=10/0;
			
			 String s=null; 
			 System.out.println(s.length());
			
			int a[]=new int[5];  
			a[10]=50;
		
		}catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		//Unreachable catch blocks - compile time errors
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (ClassCastException cce) {
			cce.printStackTrace();
		}
		catch (ClassFormatException cfe) {
			cfe.printStackTrace();
		}catch (NumberFormatException nfe) {
			nfe.printStackTrace();
		}catch (NullPointerException npe) {
			npe.printStackTrace();
		}
		

	}

}
