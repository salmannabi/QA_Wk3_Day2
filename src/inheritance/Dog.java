package inheritance;

public class Dog extends Animal {
	private String breed;
	private boolean isPanting;
	
	public Dog(String name, int age, int numOfLegs, String breed, boolean isPanting) {
		super(name, age, numOfLegs);
		this.breed = breed;
	}

	@Override
	public String toString() {
		return super.toString().substring(0, super.toString().length() - 1) + ", breed= " + breed + ", Panting= " + isPanting +  "]";
	}
	
	
}
