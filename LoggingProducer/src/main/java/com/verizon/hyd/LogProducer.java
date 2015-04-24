/**
 * 
 */
package com.verizon.hyd;

import org.apache.log4j.Logger;


/**
 * @author Mahesh
 *
 */
public class LogProducer {

	final static Logger logger = Logger.getLogger(LogProducer.class);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//PropertyConfigurator.configure(args[0]);
		LogProducer logProducer = new LogProducer();
		logProducer.runMe("Hello World");
	}
	
	private void runMe(String parameter){
		
		if(logger.isDebugEnabled()){
			logger.debug("This is debug : " + parameter);
		}
		
		if(logger.isInfoEnabled()){
			logger.info("This is info : " + parameter);
		}
		
		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);
		
	}

}
