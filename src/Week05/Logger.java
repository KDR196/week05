package Week05;

public interface Logger {
	void log(String message);
	void error(String message);
}

class AsteriskLogger implements Logger {
	
	public void log(String message) {
		
        System.out.println("***" + message + "***");
    }
	
	public void error(String message) {
        System.out.println("****************");
        System.out.println("***Error: " + message + "***");
        System.out.println("****************");
    }
} 
	    
class SpacedLogger implements Logger {
	
	public void log(String message) {
	    for (int i = 0; i < message.length(); i++) {
	        System.out.print(message.charAt(i) + " ");
	    }
	    System.out.println();
	}

	
	public void error(String message) {
	    System.out.print("ERROR: ");
	    for (int i = 0; i < message.length(); i++) {
	        System.out.print(message.charAt(i) + " ");
	    }
	    System.out.println();
	}
    
    public class App {
    	public static void main(String[] args) {
        	Logger asteriskLogger = new AsteriskLogger();
            Logger spacedLogger = new SpacedLogger();
            
            asteriskLogger.log("Hello");
            asteriskLogger.error("Hello");
            spacedLogger.log("Hello");
            spacedLogger.error("Hello");
        }
    }
}