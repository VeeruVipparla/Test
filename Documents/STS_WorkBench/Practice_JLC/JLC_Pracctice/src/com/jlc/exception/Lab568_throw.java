package com.jlc.exception;

public class Lab568_throw {

	public static void main(String[] args) {
		System.out.println("Main started");
		String nm = "";
		try {
			StudentService serv = new StudentService();
			nm = serv.getNameBySid("118");
			// nm =serv.getNameBySid("");
			// nm=serv.getNameBySid(null);;
			System.out.println("Name: " + nm);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main Completed");
	}

}

class EmptySidException extends RuntimeException {
}

class StudentNotFoundEXception extends RuntimeException {
	StudentNotFoundEXception(String sid) {
		super(sid);
	}
}

class UnmatchedStudentDataException extends RuntimeException {
	public UnmatchedStudentDataException(String sid) {
		super(sid);
	}
}

class StudentService {
	String getNameBySid(String sid) {
		if (sid == null)
			throw new NullPointerException();
		else if (sid.isEmpty())
			// return "Empty String Assign the value";
			throw new EmptySidException();
		else if (sid.equals("100"))
			throw new UnmatchedStudentDataException(sid);
		else if (sid.equals("116"))
			return "Veeru";

		else
			throw new StudentNotFoundEXception(sid);
	}
}
