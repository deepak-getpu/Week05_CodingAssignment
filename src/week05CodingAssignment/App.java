package week05CodingAssignment;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger logger1 = new AsteriskLogger();
		logger1.log("How are you?");
		logger1.error("Please correct the error");
		
		Logger logger2 = new SpacedLogger();
		logger2.log("Hi");
		logger2.error("ERROR");
		
		
		System.out.println(logger2.equals(logger1));
		
		
	

	}

}

