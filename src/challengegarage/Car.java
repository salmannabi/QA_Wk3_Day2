package challengegarage;

public class Car extends Vehicle {
	private String bootSize;
	
	public Car(int id, String make, String model, String engineSize, String gearBox, int numWheels, int price, String bootSize) {
		super(id, make, model, engineSize, gearBox, numWheels, price);
		
		this.bootSize = bootSize;
	}

	@Override
	public void generateBill(int bill) {
		System.out.println("The total bill for your car " + getMake() + " " + getModel() + " is: " + bill);
	}

	@Override
	public String toString() {
		return super.toString() + ", bootSize=" + bootSize + "]";
	}

	public String getBootSize() {
		return bootSize;
	}

	public void setBootSize(String bootSize) {
		this.bootSize = bootSize;
	}
}
