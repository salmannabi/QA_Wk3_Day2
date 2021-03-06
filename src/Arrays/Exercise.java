package Arrays;

public class Exercise {
	public void exOne() {
		int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int aLength = array.length;

		printArrElem(array, aLength);
	}
	
	public void exTwo() {
		int[] array = {10, 15, 20, 25, 30, 35, 40};
		
		int aLength = array.length;
		printArrElem(array, aLength);
		
		for (int i = 0; i < aLength; i++) {
			array[i] *= 10;
		}

		printArrElem(array, aLength);
	}
	
	public void addDigits(int num) {
		if (num < 10 || num > 99) { System.out.println("Incorrect Format: Try 10 - 99"); }
		else {
			int digitOne = num / 10;
			int digitTwo = num % 10;
			
			System.out.println("The two digits together adds up to: " + (digitOne + digitTwo));
		}
	}
	
	// Deriving string for 1 to 19 inclusive
	public void oneToNineteen(int num) {
		String[] array = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
		
		if (num < 1 || num > 19) { System.out.println("Please try again: Error in 1 - 19"); }
		else { System.out.println(array[num - 1]); }
	}
	
	// Deriving strings for the 10's between 20 to 90 inclusive
	public void twentyToNinetynine(int num) {
		String[] array = {"Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
		int elem = 0;
		int remainder = 0;
		
		if (num < 1 || num > 99) { System.out.println("Please try again: Error in 1 - 99 : " + num); }
		else {
			if (num > 19) {
				elem = num / 10;
				remainder = num % 10;
				
				if (remainder != 0) { System.out.print(array[elem - 2] + "-"); }
				else { System.out.println(array[elem -2]); }
			} else { remainder = num; }
			
			if (remainder > 0) { oneToNineteen(remainder); }
		}
	}
	
	// Deriving strings for the 10's between 20 to 90 inclusive
	public void hundredTo999(int num) {
		String[] array = {"Hundred", "Two-Hundred", "Three-Hundred", "Four-Hundred", "Five-Hundred", "Six-Hundred", "Seven-Hundred", "Eight-Hundred", "Nine-Hundred"};
		int elem = 0;
		int remainder = 0;
		
		if (num < 1 || num > 999) { System.out.println("Please try again: Error in 1 - 999"); }
		else {
			if (num > 99) {
				elem = num / 100;
				remainder = num % 100;
				
				if (remainder != 0) { System.out.print(array[elem - 1] + "-"); }
				else { System.out.println(array[elem -1]); }
			} else { remainder = num; }
			
			if (remainder > 0) { twentyToNinetynine(remainder); }
		}
	}
	
	// Deriving strings for the 10's between 20 to 90 inclusive
	public void hundredTo9999(int num) {
		String[] array = {"One-Thousand", "Two-Thousand", "Three-Thousand", "Four-Thousand", "Five-Thousand", "Six-Thousand", "Seven-Thousand", "Eight-Thousand", "Nine-Thousand"};
		int elem = 0;
		int remainder = 0;
		
		if (num < 1 || num > 9999) { System.out.println("Please try again: Error in 1 - 9999"); }
		else {
			if (num > 999) {
				elem = num / 1000;
				remainder = num % 1000;
				
				if (remainder != 0) { System.out.print(array[elem - 1] + "-"); }
				else { System.out.println(array[elem -1]); }
			} else { remainder = num; }
			
			if (remainder > 0) { hundredTo999(remainder); }
		}
	}
	
	// Helper Methods
	public void printArrElem(int[] arr, int len) {
		for (int i = 0; i < len; i++) {
			if (i != len - 1) { System.out.print(arr[i] + ", "); }
			else { System.out.println(arr[i]); }
		}
	}
}



























