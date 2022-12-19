package com.veeru.test.sb.controller;
import org.apache.log4j.*;

public class LogLevelExample {
	private static Logger logger = Logger.getLogger(LogLevelExample.class);

	public static void main(String[] args) {
		logger.setLevel(Level.TRACE);
		
		logger.trace("Trace Message!");
		logger.debug("Debug Message!");
		logger.info("Info Message!");
		logger.warn("Warn Message!");
		logger.error("Error Message!");
		logger.fatal("Fatal Message!");
	}

}
