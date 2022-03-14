package inheritance;

public class Animal {
	private String name;
	private int age;
	private int numOfLegs;
	
	public Animal(String name, int age, int numOfLegs) {
		this.name = name;
		this.age = age;
		this.numOfLegs = numOfLegs;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", numOfLegs=" + numOfLegs + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumOfLegs() {
		return numOfLegs;
	}

	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}
}
