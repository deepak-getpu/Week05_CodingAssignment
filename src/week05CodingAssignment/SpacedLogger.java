package week05CodingAssignment;


public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		
		StringBuilder build = new StringBuilder (); 
		
		
		for(int i=0; i<log.length(); i++) { 
		build.append(log.charAt(i));
		build.append(" ");
		}
		String res = build.toString();
		System.out.println(res);
		
		
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		
		StringBuilder build = new StringBuilder (); 
		
		for(int i=0; i<error.length(); i++) { 
		build.append(error.charAt(i));
		build.append(" ");
		}
		String res = build.toString();
		System.out.println("ERROR: " + res);
		
	}

}
