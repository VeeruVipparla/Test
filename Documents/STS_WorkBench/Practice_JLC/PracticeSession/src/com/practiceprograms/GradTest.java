package com.practiceprograms;

import java.util.Scanner;

public class GradTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		
		char c=calculateERP(i);
		
		System.out.println("result :: "+c);
	}

	private static char calculateERP(int erp) {
		// TODO Auto-generated method stub
		char c='A';
		 if(erp>=30 &&  erp<=100) {
			 
			 if(erp>=30  && erp <=50) {
				 return 'D';
			 } else if(erp <=60) {
				 return 'C';
			 }else if(erp <=80) {
				 return 'B';
			 }else {
				 return c;
			 }
			 
		 }
		 
		
		return c;
	}

}
