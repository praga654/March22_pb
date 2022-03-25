package Com.Logger_demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyConfiguration { 
	// factory design pattern
	static Logger log = Logger.getLogger(PropertyConfiguration.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		log.debug("debug");
		log.info("info");
		log.warn("warning");
		log.error("Error");
		log.error("fatal");
		
	}

}
