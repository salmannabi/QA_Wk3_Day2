package operators;

public class results {
	public static void main(String[] args) {
		int numOne = 12;
		int numTwo = 5;
		
		Exercise ex = new Exercise();
		Exercise exRes = new Exercise(120, 125, 105);
		
		System.out.println("Printing exercise 1 results");
		System.out.println("-----------------------------");
		System.out.println();
		
		System.out.println("Addition: " + ex.add(numOne, numTwo));
		System.out.println("Subtraction: " + ex.sub(numOne, numTwo));
		System.out.println("Multiplication: " + ex.mul(numOne, numTwo));
		System.out.println("Int Division: " + ex.divInt(numOne, numTwo));
		System.out.println("Double Division: " + ex.divDoub(numOne, numTwo));
		
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println("Printing exercise 2 results");
		System.out.println("-----------------------------");
		System.out.println();
		
		exRes.showResults();
		exRes.showPercent();
		
	}
}
