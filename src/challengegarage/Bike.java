package challengegarage;

public class Bike extends Vehicle {
	private String maxLoad;
	
	public Bike(int id, String make, String model, String engineSize, String gearBox, int numWheels, int price, String maxLoad) {
		super(id, make, model, engineSize, gearBox, numWheels, price);
		
		this.maxLoad = maxLoad;
	}

	@Override
	public void generateBill(int bill) {
		System.out.println("The total bill for your bike " + getMake() + " " + getModel() + " is: " + bill);
		
	}

	@Override
	public String toString() {
		return super.toString() + ", + maxLoad" + "]";
	}

	public String getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(String maxLoad) {
		this.maxLoad = maxLoad;
	}
}
