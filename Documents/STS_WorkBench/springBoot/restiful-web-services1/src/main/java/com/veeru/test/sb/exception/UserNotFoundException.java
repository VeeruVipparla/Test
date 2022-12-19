package com.veeru.test.sb.exception;


//@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException  extends RuntimeException  {
//Exception {
	private String message;
	/**
	 * @param message
	 */
	public UserNotFoundException(String message, int id) {
		//super(message);
		super(message +"\t : id:"+ id);
		this.message=message;
		// TODO Auto-generated constructor stub
	}
	public UserNotFoundException() {
		
	}


	
}
