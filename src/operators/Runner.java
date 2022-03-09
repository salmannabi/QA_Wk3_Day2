package operators;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOne = 12;
		int numTwo = 5;
		
		System.out.println(numOne + numTwo);
		System.out.println(numOne - numTwo);
		System.out.println(numOne * numTwo);
		System.out.println(numOne / numTwo); // Gives us an integer division without the remainder
		System.out.println(numOne % numTwo); // Gives us the remainder of a division operation

		System.out.println(numOne++);
		System.out.println(++numOne);
		
		numTwo -= 1;
		System.out.println(numTwo);
		
		boolean bool = true;
		System.out.println(!bool);
		
		
	}

}
