package week5;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Logger asteriskLogger = new AsteriskLogger();	
		 
		 Logger spacedLogger = new SpacedLogger();
		
		// Test the log and error methods for AsteriskLogger
		 
		 asteriskLogger.log("Merry Christmas");
	     asteriskLogger.error("Merry Christmas");
	     
	  // Test the log and error methods for SpacedLogger
	        spacedLogger.log("Awesome");
	        spacedLogger.error("Awesome!");
	    } 
	}


