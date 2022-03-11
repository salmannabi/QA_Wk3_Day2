package challengeperson;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person personOne = new Person("Person One", 25, "Tech Assistant");
		Person personTwo = new Person("Person Two", 30, "Tech Specialist");
		Person personThree = new Person("Person Three", 35, "DevOps Engineer");
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(personOne);
		personList.add(personTwo);
		personList.add(personThree);
		
		System.out.println("Printing a single person: ");
		System.out.println(getPerson(personTwo) + "\n");

		System.out.println("Printing each person in the Person List");
		for (Person per : personList) { System.out.println(getPerson(per)); }
	}

	public static String getPerson(Person person) {
		return person.toString();
	}
}
