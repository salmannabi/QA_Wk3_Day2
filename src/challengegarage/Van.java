package challengegarage;

public class Van extends Vehicle {
	private String carryCapacity;
	
	public Van(int id, String make, String model, String engineSize, String gearBox, int numWheels, int price, String carryCapacity) {
		super(id, make, model, engineSize, gearBox, numWheels, price);
		this.carryCapacity = carryCapacity;
	}

	@Override
	public void generateBill(int bill) {
		System.out.println("The total bill for your Van " + getMake() + " " + getModel() + " is: " + bill);
	}
	
	@Override
	public String toString() {
		return super.toString() + ", carryCapacity=" + carryCapacity + "]";
	}

	public String getCarryCapacity() {
		return carryCapacity;
	}

	public void setCarryCapacity(String carryCapacity) {
		this.carryCapacity = carryCapacity;
	}
	
	
}
