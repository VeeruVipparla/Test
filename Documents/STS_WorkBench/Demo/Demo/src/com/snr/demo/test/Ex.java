package com.snr.demo.test;

public class Ex {

	public static void main(String[] args) throws UserDefinedException  {

		try {
			System.out.println("Open files");
			int n = args.length;
			System.out.println("n value ::" + n);
			int a = 45 / n;
			System.out.println("a value ::" + a);

			int b[] = { 10, 20, 30 };
			b[50] = 100;
			
			
		}catch (Exception e) {
			// TODO: handle exception
			throw new UserDefinedException("It's Ex class"); 
		}
		

	}

}
