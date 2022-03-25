package Com.Logger_demo;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Configuration {
	// factory design pattern


	
static  Logger log = Logger.getLogger(Basic_Configuration.class);
public static void main(String[] args) {
	//configuration
	BasicConfigurator.configure();
	
	
	log.debug("debug");
	log.info("info");
	log.warn("warning");
	log.error("Error");
	log.error("fatal");
	
	
}
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  