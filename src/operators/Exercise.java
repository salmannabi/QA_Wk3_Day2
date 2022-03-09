package operators;

public class Exercise {
	private double physics;
	private double chemistry;
	private double biology;
	private double total;
	private double percentage;
	
	public Exercise() {}
	
	public Exercise(double p, double c, double b) {
		if (p <= 150 && c <= 150 && b <= 150) {
			this.physics = p;
			this.chemistry = c;
			this.biology = b;
			this.total = p + c + b;
			this.percentage = total * 100 / 450;
		}
	}
	
	public int add(int numOne, int numTwo) {
		return numOne + numTwo;
	}
	
	public int sub(int numOne, int numTwo) {
		return numOne - numTwo;
	}
	
	public int mul(int numOne, int numTwo) {
		return numOne * numTwo;
	}
	
	public int divInt(int numOne, int numTwo) {
		return numOne / numTwo;
	}
	
	public double divDoub(double numOne, double numTwo) {
		return numOne / numTwo;
	}
	
	public void showResults() {
		System.out.println("Physics: " + physics);
		System.out.println("Chemistry: " + chemistry);
		System.out.println("Biology: " + biology);
		System.out.println("Total: " + total);
	}
	
	public void showPercent() {
		System.out.println("Percentage: " + percentage);
	}
}
