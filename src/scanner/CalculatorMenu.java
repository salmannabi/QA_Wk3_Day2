package scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorMenu {
	public void startCalculator() {
		// Calculator exercise
				String choice = "y";
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("Welcome to QA Calculator!");
				
				do {
					System.out.println("What would you like to do?");
					System.out.println("1: Addition\n2: Subtraction\n3: Multiplication\n4: Division");
					int input = 0;
					try {
						System.out.println();
						System.out.print("Input: ");
						input = scanner.nextInt();
						System.out.println();
					} catch (InputMismatchException e) {
						scanner.next();
					}
					
					if (input > 0 && input <= 4) {
						System.out.print("Please enter first number: ");
						int numOne = scanner.nextInt();
						System.out.println();
						System.out.print("please enter second number: ");
						int numTwo = scanner.nextInt();
						System.out.println();
						
						switch(input) {
						case 1:
							System.out.println(numOne + " + " + numTwo + " = " + Calculator.add(numOne, numTwo));
							break;
						case 2:
							System.out.println(numOne + " - " + numTwo + " = " + Calculator.subtract(numOne, numTwo));
							break;
						case 3:
							System.out.println(numOne + " * " + numTwo + " = " + Calculator.multiply(numOne, numTwo));
							break;
						case 4:
							System.out.println(numOne + " / " + numTwo + " = " + Calculator.divide(numOne, numTwo));
							break;
						}

						// Drop the unnecessary NL character
						scanner.nextLine();
						
						do {
							System.out.println();
							System.out.println("Do you want to use the calculator again? y/n");
							choice = scanner.nextLine();
						} while (!(choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("n")));
						
						if (choice.equalsIgnoreCase("y")) {
							System.out.println();
							continue;
						} else if (choice.equalsIgnoreCase("n")) {
							// Close scanner if we reach here
							scanner.close();
							break;
						}
						
					} else {
						System.out.println();
						System.out.println("I did not get that, please try again!\n");
						continue;
					}
				} while (true);

				// Just in case we reached here
				scanner.close();
	}
}
