package com.jlc.exception;

public class Lab569_throws {
	public static void main(String[] args) {
		System.out.println("Main() method Start");
		String name = "";
		try {
			StudentService1 s = new StudentService1();
			 //s.getNameBySid("006");
			name = s.getNameBySid("006");

			System.out.println("Required Name:- " + name);//s
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main() method Completed");

	}
}

class StudentNotFoundException1 extends RuntimeException {
	StudentNotFoundException1(String sid) {
		super(sid);
	}
}

//throws StudentNotFoundException1
class StudentService1  {
	String getNameBySid(String sid) {
		if (sid == null || sid.isEmpty() || !sid.equals("006"))
			throw new StudentNotFoundException1(sid);
		else
		return "Veeranjaneyulu" ;
			
			
		
	}
}