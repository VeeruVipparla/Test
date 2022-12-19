package com.veeru.test.sb.exception;

import java.time.LocalDateTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ExceptionResponse {
	
  private Date date;
  
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
  private LocalDateTime timestamp;
  
  private String message;
  private String detail;
  //timestamp, message, and detail.
/**
 * @param date
 * @param message
 * @param desc
 */
ExceptionResponse(Date date, LocalDateTime timestamp,String message, String detail) {
	super();
	this.date = date;
	this.timestamp=timestamp;
	this.message = message;
	this.detail = detail;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public LocalDateTime getTimestamp() {
	return timestamp;
}
public void setTimestamp(LocalDateTime timestamp) {
	this.timestamp = timestamp;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getDetail() {
	return detail;
}
public void setDetail(String detail) {
	this.detail = detail;
}




  

}
