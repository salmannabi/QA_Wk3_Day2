package scanner;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Calculator {
	public static int add(int i, int j) {
		return i + j;
	}
	
	public static int subtract(int i, int j) {
		return i - j;
	}
	
	public static int multiply(int i, int j) {
		return i * j;
	}
	
	public static String divide(double i, double j) {
		NumberFormat formatter = new DecimalFormat("#0.00");
		String result = formatter.format(i / j);
		return result;
	}
}
