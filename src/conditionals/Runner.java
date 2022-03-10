package conditionals;

import java.text.DecimalFormat;
import java.text.NumberFormat;

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
		
		Tax tax = new Tax();
		System.out.println("Exercise 4 - 1");
		System.out.println("-----------------------------");
		
		NumberFormat formatter = new DecimalFormat("#0.00");
		String test1 = formatter.format(tax.varTax(19000));
		String test2 = formatter.format(tax.varTax(29000));
		String test3 = formatter.format(tax.varTax(39000));
		String test4 = formatter.format(tax.varTax(49000));
		String test5 = formatter.format(tax.varTax(120000));
		System.out.println("Tax Rate: " + test1 + "%");
		System.out.println("Tax Rate: " + test2 + "%");
		System.out.println("Tax Rate: " + test3 + "%");
		System.out.println("Tax Rate: " + test4 + "%");
		System.out.println("Tax Rate: " + test5 + "%");
		
		System.out.println("-----------------------------");

		System.out.println("Exercise 4 - 2");
		System.out.println("-----------------------------");
		String test6 = formatter.format(tax.taxAmount(19000));
		String test7 = formatter.format(tax.taxAmount(29000));
		String test8 = formatter.format(tax.taxAmount(39000));
		String test9 = formatter.format(tax.taxAmount(49000));
		String test10 = formatter.format(tax.taxAmount(120000));
		System.out.println("Tax: " + test6);
		System.out.println("Tax: " + test7);
		System.out.println("Tax: " + test8);
		System.out.println("Tax: " + test9);
		System.out.println("Tax: " + test10);
		System.out.println("-----------------------------");
		
		System.out.println("Exercise 5");
		System.out.println("-----------------------------");
		System.out.println(ex.fizzBuzz(9));
		System.out.println(ex.fizzBuzz(20));
		System.out.println(ex.fizzBuzz(30));
		System.out.println(ex.fizzBuzz(17));
		System.out.println("-----------------------------");
		
		System.out.println("Exercise Flow Chart");
		System.out.println("-----------------------------");
		FlowChart fc = new FlowChart();
		System.out.println("Testing 2100");
		fc.flow(2100);
		System.out.println("Testing 1900");
		fc.flow(1900);
		System.out.println("Testing 6100");
		fc.flow(6100);
		System.out.println("Testing 5900");
		fc.flow(5900);
		System.out.println("Testing 4100");
		fc.flow(4100);
		System.out.println("Testing 3900");
		fc.flow(3900);
		System.out.println("Testing 110");
		fc.flow(110);
		System.out.println("Testing 90");
		fc.flow(90);
		System.out.println("Testing 610");
		fc.flow(610);
		System.out.println("---");
		fc.flow(590);
		System.out.println("---");
		fc.flow(510);
		System.out.println("---");
		fc.flow(490);
		System.out.println("-----------------------------");
	}
}
