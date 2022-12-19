package com.java.pract_progrms;

public class TestEx {

	public static void main(String[] args) {
		int a = 0;
		try {
			a = 10 ;
			System.out.println(a);
		} catch (ArithmeticException ae) {

		} catch (NullPointerException ae) {

		}catch (Exception e) {
			
		}
		finally {
			int ab = 30;
			System.out.println(ab);
		}
	}
}
