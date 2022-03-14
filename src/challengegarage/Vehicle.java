package challengegarage;

public abstract class Vehicle {
	private int id;
	private String make;
	private String model;
	private String engineSize;
	private String gearBox;
	private int numWheels;
	private int price;
	
	public Vehicle(int id, String make, String model, String engineSize, String gearBox, int numWheels, int price) {
		this.id = id;
		this.make = make;
		this.model = model;
		this.engineSize = engineSize;
		this.gearBox = gearBox;
		this.numWheels = numWheels;
		this.price = price;
	}
	
	public abstract void generateBill(int bill);
	
	@Override
	public String toString() {
		return "Vehicle [id= " + id + ", make=" + make + ", model=" + model + ", engineSize=" + engineSize + ", gearBox=" + gearBox
				+ ", numWheels=" + numWheels + ", price=" + price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}

	public String getGearBox() {
		return gearBox;
	}

	public void setGearBox(String gearBox) {
		this.gearBox = gearBox;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
