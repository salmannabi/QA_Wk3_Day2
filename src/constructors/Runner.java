package constructors;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person personOne = new Person("Salman Nabi", 33, 5.8);
		Person defaultPerson = new Person();
		
		System.out.println(personOne.getName());
		System.out.println(defaultPerson.getName());
	}

}
