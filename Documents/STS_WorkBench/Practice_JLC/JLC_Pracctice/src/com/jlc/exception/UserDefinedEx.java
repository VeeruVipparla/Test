package com.jlc.exception;

public class UserDefinedEx {

	public static void main(String[] args) {
		class StudentNotFoundException extends RuntimeException{
			public StudentNotFoundException(String sid) {
				super (sid);
				
				
			}
			
		}
	}

}
