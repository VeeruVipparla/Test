package com.jlc.exception;

public class UncheckedEx {

	public static void main(String[] args) {
		try {
			int i = 10 / 0;
		}

		catch (NumberFormatException ne) {
			System.out.println(" this not a Exception");
		} catch (Exception e) {
			System.out.println("Enetr correct divident");
		}

	}
}