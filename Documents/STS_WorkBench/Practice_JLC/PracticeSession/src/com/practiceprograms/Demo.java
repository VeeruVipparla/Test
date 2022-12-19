package com.practiceprograms;

public class Demo {
	public static void main(String[] args) {
		try {
			int a = 10;
			System.out.println(a);
		} catch (ArithmeticException ae) {

		} catch (NullPointerException ne) {

		} catch (Exception e) {

		} finally {
			int a = 30;
			System.out.println(a);
		}
	}
}
