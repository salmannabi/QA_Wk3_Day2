package constructors;

public class Person {
	private String name;
	private int age;
	private double height;
	
	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public Person() {
		this.name = "Default Person";
		this.age = 30;
		this.height = 5.10;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public double getHeight() {
		return this.height;
	}
}
