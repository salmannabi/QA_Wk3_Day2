package scope;

public class Overloading {
	
	public void methodOne() {
		String message = "Good Bye";
		System.out.println(message);
	}
	
	public void methodTwo() {
		System.out.println("This is method two with no argument");
	}
	
	public void methodTwo(String message) {
		System.out.println("message");
	}
}
