package conditionals;

public class Tax {
	private int band1 = 14999; // 0% tax
	private int band2 = 19999; // 10% tax
	private int band3 = 29999; // 15% tax
	private int band4 = 44999; // 20% tax
	// Anything greater than band4 lies in band 5 with tax rate 25%
	
	public double varTax(int salary) {
		double tax = 0.0;
		int amount = salary;
		
		if (amount > band4) {
			tax += (amount - band4) * 0.25;
			amount = band4;
		}
		
		if (amount > band3) {
			tax += (amount - band3) * 0.20;
			amount = band3;
		}
		
		if (amount > band2) {
			tax += (amount - band2) * 0.15;
			amount = band2;
		}
		
		if (amount > band1) {
			tax += (amount - band1) * 0.10;
			amount = band1;
		}
		
		return (tax / salary) * 100;
	}
	
	public double taxAmount(int salary) {
		return (salary * varTax(salary)) / 100;
	}
}
