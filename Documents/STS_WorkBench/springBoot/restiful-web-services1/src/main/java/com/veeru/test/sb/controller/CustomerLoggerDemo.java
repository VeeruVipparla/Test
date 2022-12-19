package com.veeru.test.sb.controller;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class CustomerLoggerDemo {
	static Logger logger = Logger.getLogger(CustomerLoggerDemo.class);

	public static void main(String[] args) {
		logger.error("ERROR");
		logger.warn("WARNING");
		logger.fatal("FATAL");
		logger.debug("DEBUG");
		logger.info("INFO");
		
		System.out.println("Final Output");
		logger.debug(Level.INFO);
	}

}
