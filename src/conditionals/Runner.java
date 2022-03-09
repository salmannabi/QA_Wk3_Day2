package conditionals;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOne = 7;
		int numTwo = 10;
		
		if (numOne == numTwo) {
			System.out.println("The equality condition is met");
		} else {
			System.out.println("The equality condition is not met");
		}
		
		if (numOne < numTwo) {
			System.out.println("numOne is less than numTwo");
		} else {
			System.out.println("numOne is greater than numTwo");
		}
		
		if (numOne != numTwo) {
			System.out.println("The equality condition is met");
		} else {
			System.out.println("The equality condition is not met");
		}

		System.out.println();
		System.out.println("-----------------------------");
		System.out.println("Printing exercise results");
		System.out.println("-----------------------------");
		System.out.println();
		
		Exercise ex = new Exercise();
		System.out.println("Exercise 1");
		System.out.println("-----------------------------");
		System.out.println(ex.addOrMult(1, 2, true));
		System.out.println(ex.addOrMult(3, 3, false));
		System.out.println(ex.addOrMult(1, 1, true));
		System.out.println("-----------------------------");

		System.out.println("Exercise 2");
		System.out.println("-----------------------------");
		System.out.println(ex.blackJack(10, 21));
		System.out.println(ex.blackJack(20, 18));
		System.out.println(ex.blackJack(1, 22));
		System.out.println(ex.blackJack(22, 23));
		System.out.println("-----------------------------");
		
		System.out.println("Exercise 3");
		System.out.println("-----------------------------");
		System.out.println(ex.unSum(1, 2, 3));
		System.out.println(ex.unSum(3, 3, 3));
		System.out.println(ex.unSum(1, 1, 2));
		System.out.println("-----------------------------");
		
		System.out.println("Exercise 4");
		System.out.println("-----------------------------");
		
		System.out.println("-----------------------------");
	}

}
