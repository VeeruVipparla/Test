package com.veeru.test.sb.exception;

import java.time.LocalDateTime;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	
	private static final Logger logger = LoggerFactory.getLogger(CustomizedResponseEntityExceptionHandler.class);

	@ExceptionHandler(Exception.class)
	// override method of ResponseEntityExceptionHandler class
	public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request) {
		logger.debug("entered into handleAllException() method");
		ExceptionResponse exceptionResponse= new ExceptionResponse(new Date(),LocalDateTime.now(), ex.getMessage(), request.getDescription(false));  
		//returning exception structure and specific status  
	  return new ResponseEntity<Object>(exceptionResponse,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value =UserNotFoundException.class)
	// override method of ResponseEntityExceptionHandler class
	public final ResponseEntity<ExceptionResponse> handleuserNotFoundException(Exception ex, WebRequest request) {
		logger.debug("entered into handleuserNotFoundException() method");
		ExceptionResponse exceptionResponse= new ExceptionResponse(new Date(),LocalDateTime.now(), ex.getMessage(), request.getDescription(false));  
		//returning exception structure and specific status  
	  return new ResponseEntity<ExceptionResponse>(exceptionResponse,HttpStatus.NOT_FOUND);
	}

}
