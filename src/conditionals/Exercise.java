package conditionals;

public class Exercise {

	public int addOrMult(int i, int j, boolean cond) {
		if (cond) { return i + j; }
		else { return i * j; }
	}
	
	public int blackJack(int i, int j) {
		if (i > 21 && j > 21) { return 0; }
		
		if (i > j) { 
			if (i <= 21) { return i; }
			else { return j; }
		}
		else {
			if (j <= 21) { return j; }
			else { return i; }
		}
	}
	
	public int unSum(int i, int j, int k) {		
		if ((i == j) && (j == k)) { return 0; }
		if (i == j) { return k; }
		else if (i == k) { return j; }
		else if (j == k) { return i; }
		else { return i + j + k; }
	}

	public String fizzBuzz(int num) {
		if ((num % 3 == 0) && (num % 5 == 0)) { return "FizzBuzz"; }
		else if (num % 3 == 0) { return "Fizz"; }
		else if (num % 5 == 0) { return "Buzz"; }
		else { return String.valueOf(num); }
	}
}
