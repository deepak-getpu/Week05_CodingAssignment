package week05CodingAssignment;

public class Application {

	static Logger Logger; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger logger = new AsteriskLogger();
		logger.log("Hello");
		logger.error("Hello");
		
		Logger logger1 = new SpacedLogger();
		logger1.log("Hello");
		logger1.error("Hello");
		
	}

}
