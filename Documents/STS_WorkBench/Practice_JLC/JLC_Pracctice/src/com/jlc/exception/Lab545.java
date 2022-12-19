package com.jlc.exception;

public class Lab545 {

	public static void main(String[] args) {
		System.out.println("Main Started");
		try {

			String data = args[5];
		
			int x = Integer.parseInt(data);
			int res = 10 / x;
			System.out.println("Result::" + res);

		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("*Provide one value as CLA");

		} catch (NumberFormatException ne) {
			System.out.println("*Provide one value as a CLA");

		} catch (ArithmeticException ae) {
			System.out.println("*Provide non Zero int value as CLA");

		} catch (Exception e) {

			System.out.println("* Provide correct value");
		}
		System.out.println("Main Completed");
	}
}
